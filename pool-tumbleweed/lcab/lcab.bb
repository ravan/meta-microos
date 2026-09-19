SUMMARY = "Create cabinet (.cab) files"
DESCRIPTION = "LCAB is a small program for linux that creates an uncompressed MS Cabinet \
File from a set of input files."
LICENSE = "GPL-2.0-or-later"

PV = "1.0b12"

RPM_NAME = "lcab-1.0b12-2.19.aarch64.rpm"
RPM_HASH = "35e0333c54315cd6b04c080b3f4e04888fdd79da235a48843931b56cf01bfefe9125dbce389308e41cc361e8988f6649ae6fe533bf02cb30512feb0bff931f23"

RPROVIDES:${PN} += "lcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
