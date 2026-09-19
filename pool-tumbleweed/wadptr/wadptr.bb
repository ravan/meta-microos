SUMMARY = "Redundancy compressor for Doom WAD files"
DESCRIPTION = "WADptr is a utility for reducing the size of Doom WAD files. The \
'compressed' WADs will still work the same as the originals. The \
program works by exploiting the WAD file format to combine repeated / \
redundant material."
LICENSE = "GPL-2.0-or-later"

PV = "3.8"

RPM_NAME = "wadptr-3.8-1.5.aarch64.rpm"
RPM_HASH = "51aec981ebd3f9036659bec69a5c15c827773dcc7521b97ac936bd60fa0c70497d15e160d30f7ead82eb210a7197b9595e96c535600c9e658e4263e0af41d07b"

RPROVIDES:${PN} += "wadptr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
