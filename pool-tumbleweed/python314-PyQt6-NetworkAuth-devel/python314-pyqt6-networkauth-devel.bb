SUMMARY = "Devel files for python314-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-NetworkAuth-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "ef1258179844b07114bec25688c449889c09b41f407c45eda4be09d4b0cee39911d738e7c36c3d50e885608d8d4b8f402cfab618b9b2614ceb56362f73c104c4"

RPROVIDES:${PN} += "python314-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
