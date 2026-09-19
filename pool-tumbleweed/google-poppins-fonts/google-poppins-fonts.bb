SUMMARY = "Geometric sans serif typefaces"
DESCRIPTION = "Geometric sans serif typefaces have been a popular design tool ever since these actors took to the world’s stage. Poppins is one of the new comers to this long tradition. With support for the Devanagari and Latin writing systems, it is an internationalist take on the genre. \
 \
Many of the Latin glyphs (such as the ampersand) are more constructed and rationalist than is typical. The Devanagari design is particularly new, and is the first ever Devanagari typeface with a range of weights in this genre. Just like the Latin, the Devanagari is based on pure geometry, particularly circles. \
 \
Each letterform is nearly monolinear, with optical corrections applied to stroke joints where necessary to maintain an even typographic color. The Devanagari base character height and the Latin ascender height are equal; Latin capital letters are shorter than the Devanagari characters, and the Latin x-height is set rather high. \
 \
The Devanagari is designed by Ninad Kale. The Latin is by Jonny Pinhorn."
LICENSE = "OFL-1.1"

PV = "4.003"

RPM_NAME = "google-poppins-fonts-4.003-1.15.noarch.rpm"
RPM_HASH = "652a8f0d8a78db873103212bcf0071c2a23a024d94e2b08f82b0769d66dc3a98139f43d85459285ac33bdd2b9520e21b80db5dd5700e89f7b635786dc8b55877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-poppins-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
perl"

inherit rpm
