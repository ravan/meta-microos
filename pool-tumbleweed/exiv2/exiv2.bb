SUMMARY = "Tool to access image Exif metadata"
DESCRIPTION = "Exiv2 is a command line utility to access image metadata from tags like \
Exif."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.9"

RPM_NAME = "exiv2-0.28.9-2.1.aarch64.rpm"
RPM_HASH = "0ed3ab6a708ca70250af0d8618559e6393fd9108be65633d9338168d92197d6d430f91c4043386dd53faa3b1a1da58ef14f282370b0dd3d570a665887d810d4c"

RPROVIDES:${PN} += "exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
