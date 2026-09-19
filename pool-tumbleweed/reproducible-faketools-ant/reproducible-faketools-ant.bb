SUMMARY = "replacement ant"
DESCRIPTION = "a script to enhance the reproducibility of the output of ant"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-ant-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "0b3d7963dcd37e7ab68a2892d0c705906dd95db139cb63d9cc0b892b170629b1a3689d1a7d4831698f08b938f4c3a10457dad99dcf00f33b1454eb6df6f1cf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-ant"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools \
strip-nondeterminism"

inherit rpm
