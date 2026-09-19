SUMMARY = "Upstream default layout for the MATE desktop panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data. \
 \
This package contains the upstream default layout for MATE Panel."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-panel-branding-upstream-1.28.1-2.14.noarch.rpm"
RPM_HASH = "e8fee42d9a9a4724df959b60e29488fa69a26d0d67fae8a7cad50cb096f9c2f77ff02817259d616814ed56d57b0cc0f7b1aaf23fbff1d10034dcdb885465dc1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding \
mate-panel-branding-upstream"

RDEPENDS:${PN} += "mate-panel"

inherit rpm
