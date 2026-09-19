SUMMARY = "LibreOffice spellchecker/hyphenator for finnish language"
DESCRIPTION = "LibreOffice spellchecker/hyphenator for finnish language, which uses \
libvoikko as backend."
LICENSE = "GPL-3.0-or-later | MPL-2.0"

PV = "5.0"

RPM_NAME = "libreoffice-voikko-5.0-6.7.aarch64.rpm"
RPM_HASH = "6e9a6eaa1739d5b4d86502e113cf3c7b462c67109fab1ed9df90987b890f0831c044a7a814f3b3c2f081201e72831c2315d5093e09b8451732914227fcfef4d6"

RPROVIDES:${PN} += "libreoffice-voikko \
locale-libreoffice-fi"

RDEPENDS:${PN} += "python3-libvoikko"

inherit rpm
