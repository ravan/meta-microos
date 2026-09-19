SUMMARY = "Devel files for python313-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-DataVisualization-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "c4d3ac52e6cd121cd7ef392cd5acc97f5a20ee9f4a154845a1c16bf5d776a678371ff2307227d96e677ded077d3ad71877da6dd3e7854c5f744a3ae847d1c743"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization-devel \
python313-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
