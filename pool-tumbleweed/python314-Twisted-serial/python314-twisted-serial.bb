SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-serial-26.4.0-3.3.noarch.rpm"
RPM_HASH = "095fddd638db09b8f40ff5f4d6206aa62b1d294260a3a3fb8bc16cdc2081adab492abfd0112a36c6d7f3104b8fabadbc8f556b31bd5f8fa0056ecf592ef8edaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-serial"

RDEPENDS:${PN} += "python314-Twisted \
python314-pyserial"

inherit rpm
