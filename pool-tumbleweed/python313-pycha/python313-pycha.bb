SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python313-pycha-0.8.1-5.8.noarch.rpm"
RPM_HASH = "2a9695707a0f70ef344e827a9b1166bdf29d8d6843a17424b41d36163b7710774b502f4476a96fb56bbcff355a045a255c4ab43b460a0c5000a11a1c3f038c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycha \
python3.13dist-pycha \
python313-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cairocffi \
update-alternatives"

inherit rpm
