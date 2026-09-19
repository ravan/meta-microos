SUMMARY = "Source code of bazel-rules-swift"
DESCRIPTION = "Bazel rules which support building software written in Swift. \
 \
This package contains source code of bazel-rules-swift."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "bazel-rules-swift-source-0.13.0-1.18.noarch.rpm"
RPM_HASH = "7f40befec6e0ea27f2f498903d67157dde882e219f358beb41458a75d6fdefa1ecc291b9a0436a61f127801949831e90454351e2bb88d09fca26c5539a1efd4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-swift-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
