SUMMARY = "MySpell ar Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar-20240321-1.7.noarch.rpm"
RPM_HASH = "e55d02f5ad447d0cfe3e16da597b2e4ee5c7d2d1bfad2bc6cb555e99c939e0ace1e8c81dfee80902d17f145923d29cf05d550b656646b324ff0fbdf744448f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar \
locale-seamonkey-spellchecker-ar \
myspell-ar \
myspell-arabic \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
