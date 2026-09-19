SUMMARY = "Documentation and Headers for id3lib"
DESCRIPTION = "This package contains the headers and documentation for the id3lib API \
that programmers will need to develop applications which use id3lib, \
the software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-devel-3.8.3-271.5.aarch64.rpm"
RPM_HASH = "110ded3e2eda72d5cb48d7d42633df2353058df73a8f00919390f23e2050117235b4e1fae96558664235f49afc9bfa73891d8d034e901f08a42211216a89d536"

RPROVIDES:${PN} += "id3lib-devel"

RDEPENDS:${PN} += "libid3-3-8-3 \
libstdc++-devel"

inherit rpm
