SUMMARY = "Devel files for python313-PyQt6-Graphs"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-Graphs"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-Graphs-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "759582efb29eb5e4bc0b427df9c3ae6ca7625d5516e39cad05d63870b32a25b331742651aa5f2006cb3043590f71abfd1434fa67d9119d4153c84f06c90367a3"

RPROVIDES:${PN} += "python3-PyQt6-Graphs-devel \
python313-PyQt6-Graphs-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
