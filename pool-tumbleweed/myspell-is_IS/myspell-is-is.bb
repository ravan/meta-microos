SUMMARY = "MySpell is_IS Dictionary"
DESCRIPTION = "Icelandic spelling dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-is_IS-20240321-1.7.noarch.rpm"
RPM_HASH = "3a58be621809f1adb19495f065675c64633b74e3541db50f99bc64424cac145003cb1ec3e7a5aacbeeed2cbcbe559f9cc34672b520d440ab38adad91b9977457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-is-IS \
locale-seamonkey-spellchecker-is-IS \
myspell-dictionary \
myspell-is-IS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-is"

inherit rpm
