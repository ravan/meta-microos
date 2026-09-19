SUMMARY = "A C header file only implementation of a typed linked list"
DESCRIPTION = "tllist is a Typed Linked List C header file only library implemented using pre-processor macros."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tllist-devel-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "5d8846019b12646f09cd7839f6cd2b6593e25d9b4ea2f8c4047b4d3b2350d9c19e2e7e109c71a2f5536e4d68367275d6da50c6fa4b22a7ad7fec006bff34315b"

RPROVIDES:${PN} += "pkgconfig-tllist \
tllist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
