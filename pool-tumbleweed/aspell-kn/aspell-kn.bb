SUMMARY = "Kannada (ಕನ್ನಡ) Dictionary for Aspell"
DESCRIPTION = "A Kannada (ಕನ್ನಡ) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-kn-0.01.1-4.7.aarch64.rpm"
RPM_HASH = "8212900ee9dd1bdc2bb67d8f85db1d6452eda7e021317dc092307119999a6cb23fd0e46a89b51f1dfa49fc4bc61b0d8f16987e5a3804560a7c181d21f60fecfe"

RPROVIDES:${PN} += "aspell-kn \
locale-aspell-kn"

RDEPENDS:${PN} += ""

inherit rpm
