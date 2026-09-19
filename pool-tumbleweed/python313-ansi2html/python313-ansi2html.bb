SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "Convert text with ANSI color codes to HTML or to LaTeX. \
 \
Inspired by and developed off of the work of pixelbeat and blackjack. \
 \
Read the [docs](https://ansi2html.readthedocs.io/) for more informations."
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "python313-ansi2html-1.9.2-3.5.noarch.rpm"
RPM_HASH = "4f14c07203748256ec358401f06faa26ea1b02a4dd52a0ae8fcdd0da1506e13e0382e56c7b1bda8aea178847446583d520f3fce87b4113fb827baab3d9944b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansi2html \
python3.13dist-ansi2html \
python313-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
