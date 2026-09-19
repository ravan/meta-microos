SUMMARY = "Documentation for the xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. \
 \
This subpackage provides the documentation for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "xapian-core-doc-1.4.27-1.6.aarch64.rpm"
RPM_HASH = "062acd52fef3a12ee09f8cec3d248edd1dee83c5ca6d9298efe523fd0b82deef80de0ecd2fbcf2da6cafe0b9c285c97cc6b94beeb0bc6ad804663f68f1313a40"

RPROVIDES:${PN} += "xapian-core-doc"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
