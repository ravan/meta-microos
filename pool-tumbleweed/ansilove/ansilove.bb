SUMMARY = "ANSI and ASCII art to PNG converter"
DESCRIPTION = "AnsiLove/C is a tool to convert ANSI and artscene-related file formats into \
PNG images. \
 \
The following formats are supported: \
 - .ANS - ANSi (ANSI escape sequences: ANSI X3.64 standard) \
 - .PCB - PCBoard Bulletin Board System (BBS) own file format \
 - .BIN - Binary format (raw memory copy of text mode video memory) \
 - .ADF - Artworx format, supporting custom character sets and palettes \
 - .IDF - iCE Draw format, supporting custom character sets and palettes \
 - .TND - TundraDraw format, supporting 24-bit color mode \
 - .XB  - The eXtended Binary XBin format, supporting custom character \
          sets and palettes"
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "ansilove-4.2.2-1.3.aarch64.rpm"
RPM_HASH = "6c31bd3e6abf547518cd679ac644f05e54e4a7494e86b1c93ed1030f635ded0b66ccc93ce364a45ad4087c6c70b3624c1215ded07e0ab4837949de49c4622439"

RPROVIDES:${PN} += "ansilove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libansilove.so.1 \
libc.so.6"

inherit rpm
