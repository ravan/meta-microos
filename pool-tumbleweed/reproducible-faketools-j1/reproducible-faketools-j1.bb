SUMMARY = "run build with single-thread"
DESCRIPTION = "a script to facilitate the debugging of reproducibility issues \
by running rpmbuild with taskset 1 to reduce parallelism"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-j1-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "b64ff1500f88e2826ce77dad39e98ca06f3f7832e759589fdef4410445805cb53c4d5380f13e56b39fd34ded562b5d99e9258299a18b6f0c68303069c1835fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-j1"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools-rpmbuild \
util-linux"

inherit rpm
