SUMMARY = "Layout table validator"
DESCRIPTION = "Layout table validator \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftvalid-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "2bad230e185f02c6afdb24e327301e4cd6c4b2dbdf821de0d925f0b9b0063ebc3b69c5dd4c9952fd0498198efe18446d899b5fa63c6fd6f214cfa4c138241eee"

RPROVIDES:${PN} += "ftvalid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
