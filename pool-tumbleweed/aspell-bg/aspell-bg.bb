SUMMARY = "Bulgarian (български) Dictionary for Aspell"
DESCRIPTION = "A Bulgarian (български) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "aspell-bg-4.1-4.7.aarch64.rpm"
RPM_HASH = "5885955a53c1928aaf01dbff2ab7a6db0c58ae20e7ae3b5eb01a0579cbec53fa9fc369121f4cba769f53980ef886b6d66b96388c7c4443683ae156f03f9bac99"

RPROVIDES:${PN} += "aspell-bg \
locale-aspell-bg"

RDEPENDS:${PN} += ""

inherit rpm
