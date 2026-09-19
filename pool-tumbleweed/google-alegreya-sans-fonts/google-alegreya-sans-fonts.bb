SUMMARY = "Humanist sans serif family, part of Alegreya “super family”"
DESCRIPTION = "Alegreya Sans is a humanist sans serif family with a calligraphic feeling that \
conveys a dynamic and varied rhythm. This gives a pleasant feeling to readers \
of long texts. \
 \
The family follows humanist proportions and principles, just like the serif \
version of the family, Alegreya. It achieves a ludic and harmonious paragraph \
through elements carefully designed in an atmosphere of diversity. The italics \
bring a strong emphasis to the roman styles, and each have seven weights to \
bring you a wide typographic palette. \
 \
Alegreya Sans supports expert latin, greek and cyrillic character sets and \
provides advanced typography OpenType features such as small caps, dynamic \
ligatures and fractions, four set of figures, super and subscript characters, \
ordinals, localized accent forms for spanish, catalan, guaraní, dutch, turkish, \
romanian, serbian among others. \
 \
The Alegreya type system is a “super family”, originally intended for \
literature, and includes sans and serif sister families."
LICENSE = "OFL-1.1"

PV = "2.008"

RPM_NAME = "google-alegreya-sans-fonts-2.008-1.14.noarch.rpm"
RPM_HASH = "727f67d39c4e2574059498fe1f7de1f4f8217470cac460015ee5e410fa5faa6f196e1cb01246f40fa3d6b274413720868a7dbebc2e028a6c15ddbaf76671d16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-alegreya-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
