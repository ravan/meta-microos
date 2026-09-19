SUMMARY = "Font with Support for Ancient Aegean and Eastern Mediterranean Scripts"
DESCRIPTION = "Aegean covers the following scripts and symbols supported by Unicode: Basic Latin, Greek and Coptic, Greek Extended, some Punctuation and other Symbols, Linear B Syllabary, Linear B Ideograms, Aegean Numbers, Ancient Greek Numbers, Ancient Symbols, Phaistos Disc, Lycian, Carian, Old Italic, Ugaritic, Old Persian, Cypriot Syllabary, Phoenician, Lydian, and Archaic Greek Musical Notation. Aegean allocates in Plane 15 of the UCS the following scripts and symbols, as yet unsupported by Unicode: Cretan Hieroglyphs, Cypro-Minoan, Linear A, the Arkalochori Axe, signs on Troy vessels and the Dispilio tablet. In this version Linear A and B have been expanded with variant glyphs. The Tsepis stele variant of the Cypriot Syllabary has been added as its Open Type Stylistic Set VI."
LICENSE = "SUSE-Permissive"

PV = "9.78"

RPM_NAME = "gdouros-aegean-fonts-9.78-1.25.noarch.rpm"
RPM_HASH = "375f65c2ee0c5861fd1d0695fb060f02855b18934eac00f588764d6f675973fc4eb8f7253108dbb9a53dfa650ab61e33bce1c33ff980e944e9b8e41ae9b0358e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aegean-fonts \
gdouros-aegean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
