SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.3"

RPM_NAME = "python313-pygal-3.1.3-2.1.noarch.rpm"
RPM_HASH = "f7d0836991c0fd39cf9ef606487780a80dea5dcd74f321fc6494912d44b1c55e2310aaea8d661163a08a06e084b985a05b17314a289868586c86ebb594b18f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygal \
python3.13dist-pygal \
python313-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-importlib-metadata \
python313-lxml \
python313-pyquery"

inherit rpm
