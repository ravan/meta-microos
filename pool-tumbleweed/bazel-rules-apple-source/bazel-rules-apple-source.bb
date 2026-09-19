SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software for Apple platforms. \
 \
This package contains source code for bazel-rules-apple."
LICENSE = "Apache-2.0"

PV = "20190827"

RPM_NAME = "bazel-rules-apple-source-20190827-1.18.noarch.rpm"
RPM_HASH = "5e190074ce193f020639e35aad0c801a40f6a8f9fa99877efb281435baac78184fdf062e7bfb019e7354cf1e2b2d5f3a8ee4241a81085101e2b13938164c1dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-apple-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
