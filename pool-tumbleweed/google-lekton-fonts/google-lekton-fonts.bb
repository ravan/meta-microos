SUMMARY = "Monospaced Typewriter Font"
DESCRIPTION = "Lekton has been designed at ISIA Urbino, Italy, and is inspired by some of the typefaces used on the Olivetti typewriters. \
 \
It was designed by: Paolo Mazzetti, Luciano Perondi, Raffaele Flaùto, Elena Papassissa, Emilio Macchia, Michela Povoleri, Tobias Seemiller, Riccardo Lorusso, Sabrina Campagna, Elisa Ansuini, Mariangela Di Pinto, Antonio Cavedoni, Marco Comastri, Luna Castroni, Stefano Faoro, Daniele Capo, and Jan Henrik Arnold."
LICENSE = "OFL-1.1"

PV = "22"

RPM_NAME = "google-lekton-fonts-22-11.25.noarch.rpm"
RPM_HASH = "294725dfec57717ffd4d8badeb95ef12aa67b042a8f664e33da2f4bde36ad756849c27ceb135cc908377c5cbeac24052d2349137c0a92358aa7a70da6f951920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-lekton-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
