SUMMARY = "MySpell oc_FR_lengadoc Dictionary"
DESCRIPTION = "Occitan spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-oc_FR_lengadoc-20240321-1.7.noarch.rpm"
RPM_HASH = "7eacb2faa2574f846fec2c5a2042b2c6c27f53ee67717aa9fbf8bc1757b56cfc1a60482939ddc94cca395d9ef0982b61d9af948d81d78288ffbd7be85b8230c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-oc-FR-lengadoc \
locale-seamonkey-spellchecker-oc-FR-lengadoc \
myspell-dictionary \
myspell-oc-FR-lengadoc"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-oc-FR"

inherit rpm
