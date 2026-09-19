SUMMARY = "Documentation for low-memory-monitor"
DESCRIPTION = "This package provides documentation for low-memory-monitor."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "low-memory-monitor-doc-2.1-3.21.aarch64.rpm"
RPM_HASH = "3e88159d4e587d942baadf9329a721701d6df2d83e1882d4814803e1d0f101ce097329da3973f432dfe958c92cc9a45d7857161a82906ec80a692f6362fab014"

RPROVIDES:${PN} += "low-memory-monitor-doc"

RDEPENDS:${PN} += ""

inherit rpm
