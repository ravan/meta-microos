SUMMARY = "Portable Archive Exchange"
DESCRIPTION = "pax is an archiving utility specified by POSIX.1-2001. The format is \
basically tar, but with additional extended attributes."
LICENSE = "CDDL-1.0"

PV = "1.6.1"

RPM_NAME = "spax-1.6.1-53.5.aarch64.rpm"
RPM_HASH = "3a01a47ab920f6271a70b2ba132b273e830366ca9395fa1ea9e17ae0dd5c6b0ba3b2267ebdcf97f0cbe61dbf615a49ab634fb1ce3efdcc9930c5a8c6dd74d6af"

RPROVIDES:${PN} += "pax \
spax"

RDEPENDS:${PN} += "star"

inherit rpm
