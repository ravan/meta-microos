SUMMARY = "Brazilian Portuguese (Português brasileira) Dictionary for Aspell"
DESCRIPTION = "A Brazilian Portuguese (Português brasileira) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "20131030.12.0"

RPM_NAME = "aspell-pt_BR-20131030.12.0-4.7.aarch64.rpm"
RPM_HASH = "16997f6d466663412cc2950c2373b9c681ffbf694af318a1c7623980f89ec6981cb22192e93bc2892e6cb57482af741b9c926a68c5bd739f4c96497492447992"

RPROVIDES:${PN} += "aspell-pt-BR \
locale-aspell-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
