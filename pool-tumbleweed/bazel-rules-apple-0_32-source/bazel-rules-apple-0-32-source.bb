SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software for Apple platforms. \
 \
This package contains source code for bazel-rules-apple."
LICENSE = "Apache-2.0"

PV = "0.32.0"

RPM_NAME = "bazel-rules-apple-0_32-source-0.32.0-1.9.noarch.rpm"
RPM_HASH = "716b729b07d9bb9177e96f384df775e98d50c46a4a121e63bfe0729a310afd5e2c3a6f0948580b40b0b7da5747eab96684cf113706a2ab94d0183a664a324654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-apple-0-32-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3"

inherit rpm
