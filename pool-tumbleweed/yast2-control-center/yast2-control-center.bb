SUMMARY = "YaST2 - Control Center"
DESCRIPTION = "This package contains the menu selection component for YaST2."
LICENSE = "GPL-2.0-only"

PV = "5.0.3"

RPM_NAME = "yast2-control-center-5.0.3-1.5.aarch64.rpm"
RPM_HASH = "5884019453fda08c751026c6700c02b9282546ac406089552315a6b9288b6a3e0e92bfcfb0ae4a4fe42c53c7df00c7fe4c7b773f351b6020cf11f5add2620bfc"

RPROVIDES:${PN} += "yast2-control-center \
yast2-control-center-gnome"

RDEPENDS:${PN} += "yast2 \
yast2-control-center-binary"

inherit rpm
