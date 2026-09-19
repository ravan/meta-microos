SUMMARY = "Theano Classical Fonts (OpenType Format)"
DESCRIPTION = "Theano Classical Fonts include three fonts listed below. Each font is \
currently available just in one weight/shape (regular) and contains \
Latin, Greek and Cyrillic letters. \
 \
Theano Didot. \
A classicist face, with both its Roman and Greek parts implemented in \
Didot style. Unlike Old Standard, this font is designed from French \
sources. \
 \
Theano Modern. \
A font with Greek letters designed in the Porsonic style. Unlike most \
modern implementation, it is based on Figgins Pica No. 3 / Small Pica \
No. 2 — probably the most successful and once the most popular Greek \
face of a Porsonic origin — rather than on later Monotype's design. \
The accompanying Latin font is implemented in the Modern style and \
modelled after English Modern faces of later 19th century, often used \
alonglide with Porsonic Greek types. \
 \
Theano Old Style. \
A modernized 'Old Style' Greek font with a large number of historic \
ligatures and alternate forms, modelled after some early 19th century \
types designed by Figgins' type foundry. It is accompanied by a Latin \
face based on some 'Old Style' Roman fonts of the late 19th and early \
20th century. \
 \
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "thessalonica-theano-otf-fonts-2.0-11.26.noarch.rpm"
RPM_HASH = "efd1b2be99549e370cfd02e21c3a5e444a3944956b1ebd0cded435bd13812285720954f02ab18457bdc5a43d25b853a66c46b3d1bec2037f007ed3a690372c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-el;ru \
theano-fonts-otf \
thessalonica-theano-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
