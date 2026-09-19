SUMMARY = "Devel files for python314-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-3D-devel-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "540272ae7f16b960571230606de80079abbc84f3f9a177b80bc331587c61398ef590b66baa9914b1df2caada24cf177f8f15afbd5ea8f228ccfa69ffb985cb02"

RPROVIDES:${PN} += "python314-PyQt6-3D-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
