load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "lombok_plugin",
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    deps = [
        "@maven//:org_projectlombok_lombok",
    ],
    generates_api = 1,
)

java_library(
    name = "lombok",
    exports = [
        "@maven//:org_projectlombok_lombok",
    ],
    exported_plugins = [
        ":lombok_plugin"
    ],
)

java_library(
    name = "lombok-idea-val-bug-lib",
    srcs = glob(["src/main/java/com/example/myproject/*.java"]),
    deps = [
        ":lombok"
    ],
)

java_binary(
    name = "lombok-idea-val-bug",
    main_class = "com.example.myproject.App",
    runtime_deps = [":lombok-idea-val-bug-lib"],
)
