SUMMARY = "MySpell nn_NO Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-nn_NO-20240321-1.7.noarch.rpm"
RPM_HASH = "a4154108a66aad348a3723ce19c77f7d1cf9ff8784ba7371667c9a0f2301d1fbb3637ade55639f43c87270dea1115ff10e30b9c3805edd46a1d9db21afbbc99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-nn-NO \
locale-seamonkey-spellchecker-nn-NO \
myspell-dictionary \
myspell-nn-NO \
myspell-norsk-nynorsk"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-no"

inherit rpm
