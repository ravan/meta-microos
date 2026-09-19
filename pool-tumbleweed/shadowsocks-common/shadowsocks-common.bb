SUMMARY = "Shdowsocks Common File"
DESCRIPTION = "Shdowsocks Common File."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "shadowsocks-common-1.0.0-1.3.noarch.rpm"
RPM_HASH = "5c37c93cf975f6e18150dc33e3161ff77b78b6c26945979ed98241e198139cfed55df42bde37bc9e1196f8759483fa2af989749e67e549173895e89356194dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-common"

RDEPENDS:${PN} += "group-shadowsocks \
shadowsocks-sysuser \
sysuser-shadow"

inherit rpm
