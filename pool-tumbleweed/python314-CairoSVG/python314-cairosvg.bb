SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python314-CairoSVG-2.9.0-1.3.noarch.rpm"
RPM_HASH = "34b50d9d81f5c6a62b067821da4defb1a03435265f7833c17f1cf20544bfec81d9095de4558bc4399368f31c330e6cfb04a8a459ea8b79832838ff9d063aa2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cairosvg \
python314-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-cairocffi \
python314-cssselect2 \
python314-defusedxml \
python314-tinycss2"

inherit rpm
