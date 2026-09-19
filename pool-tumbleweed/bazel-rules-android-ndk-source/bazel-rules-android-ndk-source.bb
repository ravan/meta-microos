SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software using Android NDK. \
 \
This package contains source code for bazel-rules-android-ndk."
LICENSE = "Apache-2.0"

PV = "20220902"

RPM_NAME = "bazel-rules-android-ndk-source-20220902-1.9.noarch.rpm"
RPM_HASH = "a27b5e2c03401c503072c08f2fd49cf5a7af8dd278586f2a812780e692ed394ce97f6f9da8bb0e63d0e62698be6142ea9726d8ac4193ac3c5c6f704e3f2944f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-android-ndk-source"

RDEPENDS:${PN} += ""

inherit rpm
