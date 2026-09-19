SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python314-feedgen-1.0.0-2.5.noarch.rpm"
RPM_HASH = "7d23b947903c991c3662ccc50bc9c570e9ffd99e1f24526b96d6bb247da4fc5d273014d561f9deeb49e9f011b1ab0de7dcc287f79518db7ec00a6c8b4ab45950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-feedgen \
python314-feedgen \
python3dist-feedgen"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-python-dateutil"

inherit rpm
