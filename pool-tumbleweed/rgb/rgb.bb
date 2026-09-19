SUMMARY = "X color name database"
DESCRIPTION = "This package includes both the list mapping X color names to RGB values \
(rgb.txt) and, if configured to use a database for color lookup, the \
rgb program to convert the text file into the binary database format."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "rgb-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "ebddfd7b7c15aa92bc5f3a3a37e731bbe27b37e9c1c3a77d69019f5da793812249ab7b9eef3b10cf211ff42a9155f2028c88d5feab01f6f712b400d4665059cd"

RPROVIDES:${PN} += "rgb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
