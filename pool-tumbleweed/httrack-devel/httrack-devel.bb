SUMMARY = "Development files for httrack"
DESCRIPTION = "This package contains the header and library files for httrack."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "httrack-devel-3.49.2-3.11.aarch64.rpm"
RPM_HASH = "f6690a8f35391cbc84f0657fa275aeb23bca42f6dec950058973d5ff582ed85567c87fdce20c9f2e84a5dd2659d37505896fe192d6ca2601ffd035b9f8cd41d7"

RPROVIDES:${PN} += "httrack-devel"

RDEPENDS:${PN} += "libhttrack2 \
libopenssl-devel"

inherit rpm
