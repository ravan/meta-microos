SUMMARY = "HTML Documentation for libuser"
DESCRIPTION = "HTML Documentation for libuser."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "libuser-docs-0.64-2.7.noarch.rpm"
RPM_HASH = "d1f22a01dd51a0cc0973e5a78903cd74cb226a921f5954b1cee5b29e681766864622d9de2106b4e50dee25447b9e5d3fbf580bf3008eb36b79ff453964e73868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libuser-docs"

RDEPENDS:${PN} += ""

inherit rpm
