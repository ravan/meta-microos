SUMMARY = "Source code of bazel-rules-go"
DESCRIPTION = "Bazel rules which support building software written in Go, specifically: \
- building libraries \
- building binaries \
- executing tests \
- vendoring \
- cgo builds \
- cross compilation \
- auto generating Bazel BUILD files \
- build-time code analysis via nogo \
 \
This package contains source code of bazel-rules-go."
LICENSE = "Apache-2.0"

PV = "0.20.3"

RPM_NAME = "bazel-rules-go-source-0.20.3-2.14.noarch.rpm"
RPM_HASH = "8c26361c140243f43288a2720fa0a7a3be9dd2eddd4da2ab082b651496e9a293fd513abdd45da91267290d20075bc1671b5060ee1245b6a327c11af74a44d623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-go-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
