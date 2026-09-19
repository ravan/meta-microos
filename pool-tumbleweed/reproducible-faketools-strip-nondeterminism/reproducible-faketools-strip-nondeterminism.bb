SUMMARY = "Run strip-nondeterminism after build"
DESCRIPTION = "enhance the reproducibility of various file formats \
with strip-nondeterminism"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-strip-nondeterminism-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "57efc462fff5c1b123fca0ca2818baed71682aadd2e16cdd2847b4556eca70733fe233fdb9042068b33e992bd2207d13d5c2ade192bc536b404eb4932b0c6991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-strip-nondeterminism"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools \
strip-nondeterminism"

inherit rpm
