SUMMARY = "Devel files for python313-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-WebEngine-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "d2190d174412ded84c2e1bfa6afd2b12a72a6235701354c388ff2d71e816287c3afa361e39bc52dc4a11961ffa0cf6a6fd6b454954b8236c4824b9af7dc7afb7"

RPROVIDES:${PN} += "python3-PyQt6-WebEngine-devel \
python313-PyQt6-WebEngine-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
