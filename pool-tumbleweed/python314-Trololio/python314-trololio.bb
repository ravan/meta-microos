SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python314-Trololio-1.0-4.5.noarch.rpm"
RPM_HASH = "591ba5cc510ebbf043c0d707c53502ec4c71a0f7e3cc3d78a196165a98ce309230dd8aceaf4f3f8826dab1a0aa5863ce5397388f4dc6c44978dd298250a8c6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trololio \
python314-Trololio \
python3dist-trololio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
