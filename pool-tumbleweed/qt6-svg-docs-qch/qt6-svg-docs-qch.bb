SUMMARY = "Documentation for qt6-svg in QCH format"
DESCRIPTION = "This package contains documentation for qt6-svg in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-svg-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "134772a030193cebbbae33b7a176bc9e6caabdfc05a4e27540a85dad61c4030949094b1f42b1032208ed7f72bec68407389053ad047ca5320d08da237c3d6f6f"

RPROVIDES:${PN} += "qt6-svg-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
