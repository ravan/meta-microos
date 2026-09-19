SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "clanlib-examples-4.2.0-4.1.noarch.rpm"
RPM_HASH = "c2e9ac595d53f736dcb51ed44e3a8dfa4e9fcf8f51b38a2da83a9f495c23b48689c1850aa1ba83bc3c3718d7996f91d85d96259cace91da048cc297df4135228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-examples"

RDEPENDS:${PN} += "clanlib \
clanlib-devel"

inherit rpm
