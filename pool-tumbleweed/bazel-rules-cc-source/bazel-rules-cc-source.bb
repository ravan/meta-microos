SUMMARY = "Source code of bazel-rules-cc"
DESCRIPTION = "Bazel rules which support building software written in C++. \
 \
This package contains source code of bazel-rules-cc."
LICENSE = "Apache-2.0"

PV = "20190722"

RPM_NAME = "bazel-rules-cc-source-20190722-1.18.noarch.rpm"
RPM_HASH = "887f20cb6d7f2faff6bfb8d0c001b4821a0278d81ebe3b721a9822dc31e31fd0c54326ca8eec9a42969780e1b06e5436f2d1b69959429bc3809f02d35562e605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-cc-source"

RDEPENDS:${PN} += ""

inherit rpm
