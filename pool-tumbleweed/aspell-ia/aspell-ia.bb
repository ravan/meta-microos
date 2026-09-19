SUMMARY = "Interlingua Dictionary for Aspell"
DESCRIPTION = "An Interlingua dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-ia-0.50-4.7.aarch64.rpm"
RPM_HASH = "3a9afdf641f59a5c5fbae8d79e6033aad85c8a98cfcb15aaa805ebce9c965d82690e81294782b797ad9c6ff6d2b39f01c92fcf3f554e6c6118e13539ff06bdfc"

RPROVIDES:${PN} += "aspell-ia \
locale-aspell-ia"

RDEPENDS:${PN} += ""

inherit rpm
