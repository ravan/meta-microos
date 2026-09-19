SUMMARY = "Source code of bazel-rules-pkg"
DESCRIPTION = "Bazel rules for building tar, zip, deb, and rpm for packages. \
 \
This package contains source code for bazel-rules-pkg."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "bazel-rules-pkg-source-0.7.0-1.9.noarch.rpm"
RPM_HASH = "e5a8c7bfed27d33d0d48773a5c811ecb9d5e5010c1e898b7b4d514b10fba8d1702d1e9661c900a17bcc6a55cf9770032a27b96fca193c8f0403475e278784672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-pkg-source"

RDEPENDS:${PN} += ""

inherit rpm
