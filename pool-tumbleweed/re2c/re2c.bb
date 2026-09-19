SUMMARY = "Tool for generating C-based recognizers from regular expressions"
DESCRIPTION = "re2c is a tool for writing fast and flexible lexers. Unlike other such \
tools, it concentrates solely on generating efficient code for matching \
regular expressions. This makes it suitable for a wide variety of \
applications. The generated scanners approach hand-crafted ones in \
terms of size and speed."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "4.6"

RPM_NAME = "re2c-4.6-1.1.aarch64.rpm"
RPM_HASH = "e23318e7775485de3c0dd0178e951c4ac5c059926ad00f3ddbfa6ced96e286bc689cd9d83ab2bd666ba4d7de08b9ea28571a2c2772daf86ebbddcc5cd0b70097"

RPROVIDES:${PN} += "re2c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
