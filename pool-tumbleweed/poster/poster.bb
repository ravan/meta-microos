SUMMARY = "Tool for printing posters over multiple pages"
DESCRIPTION = "This program scales a PostScript page to a given size (a poster). The \
output can be tiled on multiple sheets, and output media size can be \
chosen independently. Each tile (sheet) of a will bear cropmarks and \
slightly overlapping image for easier poster assembly. In principle it \
requires the input file to adhere to 'eps' (encapsulated postscript) \
conventions but it will work for many 'normal' postscript files as \
well. \
 \
 \
 \
Authors: \
-------- \
    Jos T.J. van Eijndhoven <J.T.J.v.Eijndhoven@ele.tue.nl> \
    Michael Goffioul <goffioul@imec.be>"
LICENSE = "GPL-2.0+"

PV = "20060221"

RPM_NAME = "poster-20060221-93.35.aarch64.rpm"
RPM_HASH = "e8eb433c3dcad65102b201a6223a5ddfc00c66abff92f037b4bb1dbfbb321cf9008e32ee96c9ea2b990b621f68c1ad101d409b4d12340f31ed3d1968a8847e5c"

RPROVIDES:${PN} += "poster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
