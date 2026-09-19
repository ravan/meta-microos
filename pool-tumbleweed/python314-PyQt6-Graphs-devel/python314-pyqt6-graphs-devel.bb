SUMMARY = "Devel files for python314-PyQt6-Graphs"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python314-PyQt6-Graphs"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-Graphs-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "93b1af36291d657eca6c0d9733fc2205f4b0183fb30acf6fc34cbfba4edc3a31b990765945bd0f29221e75a189ab8e839416302ba3196b5510156b1a971d996a"

RPROVIDES:${PN} += "python314-PyQt6-Graphs-devel"

RDEPENDS:${PN} += "python-abi \
python314-PyQt6-devel"

inherit rpm
