SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.3"

RPM_NAME = "python314-pygal-3.1.3-2.1.noarch.rpm"
RPM_HASH = "3e7a8cb75f2bf6941bb9ef9a72973dbbbd3b6dbcc388a771c47c6727fbcfbe8765a2c4c439d335dcba7b4f7af6bafb8accc437c8634bcfadcde5d7658ded0c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygal \
python314-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-importlib-metadata \
python314-lxml \
python314-pyquery"

inherit rpm
