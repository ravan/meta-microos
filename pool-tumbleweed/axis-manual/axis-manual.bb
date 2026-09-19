SUMMARY = "Manual for axis"
DESCRIPTION = "Manual for axis"
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-manual-1.4-310.6.noarch.rpm"
RPM_HASH = "e9ea10f516ccaccccdbf18bb885ad1742ed9e00d595fea4c641322264246aedd8ad4b8411421480a804d2bd571e32f29f34f691c9e6f31fa86ebcdc91609a984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis-manual"

RDEPENDS:${PN} += ""

inherit rpm
