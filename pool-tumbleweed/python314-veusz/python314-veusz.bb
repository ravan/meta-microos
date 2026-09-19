SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "4.2.1"

RPM_NAME = "python314-veusz-4.2.1-1.3.aarch64.rpm"
RPM_HASH = "6998c3fb60f27a7196158ed311bbff399cfa61031c6a2955d135622b048bf810c3863f4332a78275907889b126cc28cf152471c6c8a79f2da54fb116fcfdceea"

RPROVIDES:${PN} += "python3.14dist-veusz \
python314-veusz \
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
python314-PyQt6 \
python314-numpy \
veusz-common"

inherit rpm
