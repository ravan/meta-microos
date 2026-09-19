SUMMARY = "MySpell id_ID Dictionary"
DESCRIPTION = "Indonesian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-id_ID-20240321-1.7.noarch.rpm"
RPM_HASH = "3040c2a406905d987df0c93ed5fa646928729c3bd5448c30458246923ac56d507631e59cacdb4313d06e93484edbefd58e5385e72e5ae1b40e060513e8728568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-id-ID \
locale-seamonkey-spellchecker-id-ID \
myspell-dictionary \
myspell-id-ID"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-id"

inherit rpm
