SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python314-tri.struct-4.1.0-2.6.aarch64.rpm"
RPM_HASH = "d41d48b27f897be7430df2a286e8a772bfd592512a42c183b8f3cbecb792ce67936af8ae1c3358ad6f7e532296d874b444890f100fdf27a73160712417d964fa"

RPROVIDES:${PN} += "python3.14dist-tri.struct \
python314-tri.struct \
python3dist-tri.struct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
