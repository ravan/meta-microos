SUMMARY = "Devel files for python314-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-Charts-devel-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "a63b162ae0436d501ee46d565857ebff9a1284bd94b41908cd5e698419353e6447a232bba3cee98cf645949b0c631b2e299b3123b5f960bf09df42a1bf689c4b"

RPROVIDES:${PN} += "python314-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
