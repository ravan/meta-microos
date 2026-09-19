SUMMARY = "YaST2 - AutoYaST Schema"
DESCRIPTION = "AutoYaST Syntax Schema"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "yast2-schema-5.0.3-1.3.aarch64.rpm"
RPM_HASH = "25daa584cf33a1c76e97f8f740b4d6389be3c19deefb8ea96fb38eac1e2130a6c00bdd444c90af9c1b039b9cf7b1ab7100633ce1aa07799f2efcd368101fc8a9"

RPROVIDES:${PN} += "yast2-schema"

RDEPENDS:${PN} += ""

inherit rpm
