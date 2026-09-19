SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.62.1"

RPM_NAME = "python313-FontTools-4.62.1-1.3.noarch.rpm"
RPM_HASH = "5014ad4c070603f2d0c2ef775495a7c9dcd6917d3966d754b7967dc5069b77759d14837fb7e528ca09ad946c6454d779bafbaf361cadeb7927bda4f03934df56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonttools \
python3-FontTools \
python3-fonttools \
python3.13dist-fonttools \
python313-FontTools \
python313-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
