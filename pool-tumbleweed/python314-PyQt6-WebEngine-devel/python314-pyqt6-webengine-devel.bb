SUMMARY = "Devel files for python314-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-WebEngine-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "0c5d89323a1afe342561565ab94e8190ff540e24457b0ba0a5a7749465dd86e47b71ac9ac9cfbf840c1786e0c99e9ddfd004b01d98b23770152418d788a8d979"

RPROVIDES:${PN} += "python314-PyQt6-WebEngine-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
