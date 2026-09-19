SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.62.1"

RPM_NAME = "python314-FontTools-4.62.1-1.3.noarch.rpm"
RPM_HASH = "e58e1c7fee05cd8a62b8d6ae3a044f32e9e850f9ec7b61f34ca83ec9b33afee250cb7ea8cf1dfd4a2fc2b6507af13b5a62f44e61008d18bd69c03f700e01ac6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonttools \
python3.14dist-fonttools \
python314-FontTools \
python314-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
