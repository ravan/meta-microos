SUMMARY = "Customisable application to read and write meta information in files"
DESCRIPTION = "ExifTool is a a full-featured application for reading and writing \
meta information in a wide variety of files, including the maker \
note information of many digital cameras by various manufacturers \
such as Canon, Casio, FujiFilm, GE, HP, JVC/Victor, Kodak, Leaf, \
Minolta/Konica-Minolta, Nikon, Olympus/Epson, Panasonic/Leica, \
Pentax/Asahi, Reconyx, Ricoh, Samsung, Sanyo, Sigma/Foveon and Sony."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "13.59"

RPM_NAME = "exiftool-13.59-1.3.noarch.rpm"
RPM_HASH = "460934d1c27b63b462836055726828d9516a1004a39a5934e59cc5b160afb69143554d702f5553a9ef6f732e23683221bca8f496c5e40ebf6df085594c1881f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiftool"

RDEPENDS:${PN} += "/usr/bin/env \
perl-Image--ExifTool"

inherit rpm
