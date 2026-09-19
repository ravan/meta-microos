SUMMARY = "Source code of bazel-rules-android"
DESCRIPTION = "Bazel rules to build software for Android. \
 \
This package contains source code of bazel-rules-android."
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "bazel-rules-android-source-0.1.1-1.14.noarch.rpm"
RPM_HASH = "b32a4d6e5d361e73adf9f4533efd5ed4bff347d979d86e89ec84b8df2d5abdcd0c10de41a2c647a9b41296f0e5355dbfc94aee7e776e7da6c844ca7cbd25422c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-android-source"

RDEPENDS:${PN} += ""

inherit rpm
