SUMMARY = "A CD image format converter from .bin/.cue to .iso/.cdr/.wav"
DESCRIPTION = "The bchunk package contains a UNIX/C rewrite of the BinChunker \
program. BinChunker converts a CD image in a .bin/.cue format \
(sometimes .raw/.cue) into a set of .iso and .cdr/.wav tracks. \
The .bin/.cue format is used by some non-UNIX CD-writing \
software, but is not supported on most other CD-writing programs."
LICENSE = "GPL-2.0+"

PV = "1.2.2"

RPM_NAME = "bchunk-1.2.2-1.29.aarch64.rpm"
RPM_HASH = "47738476f34e847df2f785e05b7d459839993d1a92c064ba84d0aebd35d44eeeea77b762b55a4152dcfac75d2c6c0864755ba579331b22c9cd007952cd6b3b67"

RPROVIDES:${PN} += "bchunk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
