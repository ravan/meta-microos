SUMMARY = "run build with strace"
DESCRIPTION = "a script to facilitate the debugging of reproducibility issues \
by running rpmbuild with strace to find how files are created"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-strace-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "5a5ced32f8c43de160396c7fe326589d1b2e193770530a945485f4a972aefb4c811392161133c1a1dedefef0e373949df830ceec8b49ebf3393fd5e9623382c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-strace"

RDEPENDS:${PN} += "reproducible-faketools-rpmbuild \
strace"

inherit rpm
