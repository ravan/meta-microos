SUMMARY = "Conversion between math formats"
DESCRIPTION = "The texmath library provides functions to read and write TeX math, presentation \
MathML, and OMML (Office Math Markup Language, used in Microsoft Office). \
Support is also included for converting math formats to Gnu eqn, typst, and \
pandoc's native format (allowing conversion, via pandoc, to a variety of \
different markup formats). The TeX reader supports basic LaTeX and AMS \
extensions, and it can parse and apply LaTeX macros. (See \
<https://johnmacfarlane.net/texmath here> for a live demo of bidirectional \
conversion between LaTeX and MathML.) \
 \
The package also includes several utility modules which may be useful for \
anyone looking to manipulate either TeX math or MathML. For example, a copy of \
the MathML operator dictionary is included. \
 \
Use the 'executable' flag to install a standalone executable, 'texmath', that \
converts formulas from one format to another. (Use the '--help' flag for a \
description of all functionality). \
 \
Use the 'server' flag to install a web server, 'texmath-server', that exposes a \
JSON API allowing conversion of individual formulas and batches of formulas."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1.2"

RPM_NAME = "texmath-0.13.1.2-1.3.aarch64.rpm"
RPM_HASH = "01bcf6a4a1adc0227f052c6cc6c7bdfb36e0899839fe7e309ee0535e0c7376f39f36b05435fd82ae14e9625ae4c8f00fb8b065e2f54adf225861d471eaed1991"

RPROVIDES:${PN} += "texmath"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
