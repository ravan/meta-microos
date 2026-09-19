SUMMARY = "WAD composer for Doom and related games"
DESCRIPTION = "DeuTex is a .wad file composer for Doom, Heretic, Hexen and Strife. \
It can be used to extract the lumps of a WAD and save them as \
individual files. Conversely, it can also build a WAD from separate \
files. When extracting a lump to a file, it does not just copy the \
raw data, it converts it to an appropriate format (such as PNG for \
graphics, WAVE for audio samples, etc.). Conversely, when it reads \
files for inclusion in PWADs, it does the necessary conversions (for \
example, from PPM to Doom picture format). In addition, DeuTex has \
functions such as merging WADs."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "deutex-5.2.3-1.7.aarch64.rpm"
RPM_HASH = "e98be82c5d60f58cdbfcddbd9d6d3221c9b6d5f5296a0ce33e91a478f501794f349fd1bc1b613b94d458d5361c3d4aad4474b2577b22a90253044d8593a4aa1a"

RPROVIDES:${PN} += "deutex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
