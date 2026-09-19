SUMMARY = "An ASCII to PostScript(tm) Converter"
DESCRIPTION = "Enscript converts ASCII files to PostScript and writes the generated \
output to a file or sends it directly to the printer. \
 \
The Enscript configuration file is in /etc/enscript.cfg. \
 \
Warning: enscript is not able to convert complex unicode (UTF-8) text \
to PostScript.	Only language text which can be converted from UTF-8 to \
latin encodings are supported with the help of a wrapper script. ~ ~"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.6"

RPM_NAME = "enscript-1.6.6-4.6.aarch64.rpm"
RPM_HASH = "0f01cf9b83dad58d4f6b6a4afa05612e2e4a2f903181abf39313ae2f4c8268c7db7671e710e9b3e8906d5333db29cdc0ea584d15ab1283495716738438ff1919"

RPROVIDES:${PN} += "config-enscript \
enscript \
genscript \
nenscrip"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/file \
/usr/bin/iconv \
/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
ghostscript-fonts-std \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
