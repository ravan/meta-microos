SUMMARY = "Static probe support tools"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the support tools for static probes."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-sdt-devel-5.5-1.3.aarch64.rpm"
RPM_HASH = "de4e78fabc5aa87ea18e0012885f9a70cbbe9f965dc652371a6ebb3ac321e4a9361a610d2f6ca6ac80c9f98eef7b1c813fc4f505e4facc80b0f888e43fcd5d1d"

RPROVIDES:${PN} += "systemtap-sdt-devel"

RDEPENDS:${PN} += "systemtap"

inherit rpm
