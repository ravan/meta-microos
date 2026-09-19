SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "4.2.1"

RPM_NAME = "python313-veusz-4.2.1-1.3.aarch64.rpm"
RPM_HASH = "38ae15f6da4b0bccb63a77258afc751eb66f9d183ade62e4e4ee8a519b87c0c1b91acae63f9277ced4b46727c064cfe0cb2ef6b1a64251a685f5020abae8eecf"

RPROVIDES:${PN} += "python3-veusz \
python3.13dist-veusz \
python313-veusz \
python3dist-veusz"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-numpy \
veusz-common"

inherit rpm
