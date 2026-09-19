SUMMARY = "Make self-extractable archives on Unix"
DESCRIPTION = "Small shell script that generates a self-extractable tar.gz archive from a \
directory. The resulting file appears as a shell script (many of those \
have a .run suffix), and can be launched as is. The archive will then \
uncompress itself to a temporary directory and an optional arbitrary \
command will be executed (for example an installation script). \
 \
This is pretty similar to archives generated with WinZip Self-Extractor in \
the Windows world. Makeself archives also include checksums for integrity \
self-validation (CRC and/or MD5 checksums)."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.1"

RPM_NAME = "makeself-2.7.1-1.3.noarch.rpm"
RPM_HASH = "cdcccf8447d9ebba46a7153e1c41f73305be9bc742142570105a4bbb57a43a67ad96399f16b6081084ae404809235ac8ced9cacf228b376dd9c5e56b781520e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "makeself"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
