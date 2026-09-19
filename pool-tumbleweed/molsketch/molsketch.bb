SUMMARY = "2D molecular structures editor"
DESCRIPTION = "The purpose of this editor to help drawing molecules. \
Features: \
 * open, save and import in all formats supported by the OpenBabel library \
 * export to Scalable Vector Graphics (SVG) and a number of common used bitmap \
   formats \
 * print and export your document to PDF"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "molsketch-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "f1840f5e40407ae7218388a2994d654337562c596d8010044b46268304dd101fc3169ed03008ef27d52bbbc13b674dece3cdea716dc94bf92e3b98774868b72a"

RPROVIDES:${PN} += "libmolsketch.so \
libmskcore.so \
libobabeliface.so \
molsketch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.8 \
libstdc++.so.6"

inherit rpm
