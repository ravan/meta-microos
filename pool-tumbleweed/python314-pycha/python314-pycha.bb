SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python314-pycha-0.8.1-5.8.noarch.rpm"
RPM_HASH = "b6aff8227cee0d9ab78810c55413d8603f6ba572c78700ff9050a49c934a0e90af15a4072c5c74d288d4538d9d0bcd3ae79313e1597f4eabf684843ad7892105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycha \
python314-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cairocffi \
update-alternatives"

inherit rpm
