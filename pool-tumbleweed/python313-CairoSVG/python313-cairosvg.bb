SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python313-CairoSVG-2.9.0-1.3.noarch.rpm"
RPM_HASH = "20cc3e67efa6301d19d24e806e16b51af397eb900290b0f35c376ccb6f90ff74994140d0379ca4514ec5ef638cf103ff9dc3e9ab108ac870afa98f7816cf43c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CairoSVG \
python3.13dist-cairosvg \
python313-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-cairocffi \
python313-cssselect2 \
python313-defusedxml \
python313-tinycss2"

inherit rpm
