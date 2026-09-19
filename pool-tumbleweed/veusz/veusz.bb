SUMMARY = "GUI scientific plotting package"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "4.2.1"

RPM_NAME = "veusz-4.2.1-1.3.noarch.rpm"
RPM_HASH = "f7108f865daf555ca5980e81d04da07a9eb895d38a94c0b4794da17dbf08c873830b9a8568d38ed38d5f20335b0a7c250da87121891be18115d41f23fb70f0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "veusz \
veusz3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
desktop-file-utils \
python3-veusz \
shared-mime-info \
veusz-common"

inherit rpm
