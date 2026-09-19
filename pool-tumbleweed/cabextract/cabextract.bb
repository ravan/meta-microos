SUMMARY = "A Program to Extract Microsoft Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which Microsoft uses to \
distribute their software and things like Windows Font Packs. \
cabextract can be used to unpack these files."
LICENSE = "GPL-3.0-or-later"

PV = "1.11"

RPM_NAME = "cabextract-1.11-1.13.aarch64.rpm"
RPM_HASH = "865ff83343ebbc544f66b2ca4498f038bfbb7b864f92635457ca0d5bfe851d2ac15f2c8618ecfec0615193fdffb7ffbab4b7d7dcb0ddd4dec7e89b4abd28e17a"

RPROVIDES:${PN} += "cabextract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmspack.so.0"

inherit rpm
