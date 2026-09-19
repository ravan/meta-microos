SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "Convert text with ANSI color codes to HTML or to LaTeX. \
 \
Inspired by and developed off of the work of pixelbeat and blackjack. \
 \
Read the [docs](https://ansi2html.readthedocs.io/) for more informations."
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "python314-ansi2html-1.9.2-3.5.noarch.rpm"
RPM_HASH = "96456c622eedf8400e63a7a4c81b7ca22580981640db20455e239bd0dd743c4ddb53449092656eab72161215f155a4d056818753750aaea5ded952c832e21c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ansi2html \
python314-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
