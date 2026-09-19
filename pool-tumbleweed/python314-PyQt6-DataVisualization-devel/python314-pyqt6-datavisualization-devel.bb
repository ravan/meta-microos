SUMMARY = "Devel files for python314-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-DataVisualization-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "4a2423e73bbff4b6fdaa78285bf0b04a6717fc374136a7cfa8e636446b5c9856854d9ddc63dd2a987f641b7856868d241c8b7009ac5cddbd241cfa2592ace375"

RPROVIDES:${PN} += "python314-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
