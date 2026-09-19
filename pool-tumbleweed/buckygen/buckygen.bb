SUMMARY = "Generator for nonisomorphic fullerenes"
DESCRIPTION = "Buckygen is a program for the efficient generation of all \
nonisomorphic fullerenes. These are triangulations where all vertices \
have degree 5 or 6. Or if the dual representation is used: cubic \
plane graphs where all faces are pentagons or hexagons."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "buckygen-1.1-2.5.aarch64.rpm"
RPM_HASH = "3a4e14b610b8b9cafac228f20369e26ae124ab418bb2f4411c0d93eb60db6f2918f81139b7c46e7a88354fed892af5ff355b4bbe9c9594937e2efb46f5a63bd3"

RPROVIDES:${PN} += "buckygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
