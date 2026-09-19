SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering. Included in the package \
is a simple application, lasemrender, which is able to convert a MathML, a Latex \
math or an SVG file to either PNG, PDF or an SVG image."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-0.4.4-4.14.aarch64.rpm"
RPM_HASH = "16bb288c93817de29e4c25ceb5045ae90e51a7ac96d96c82b4059e3754a68d84698440cf0cbde572dc0c81aaf2412c2d5283d54717dfe746eeeec90cd1d40191"

RPROVIDES:${PN} += "lasem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblasem-0.4.so.4"

inherit rpm
