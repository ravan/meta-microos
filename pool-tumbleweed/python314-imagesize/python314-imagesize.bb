SUMMARY = "Getting image size from PNG/JPEG/JPEG2000/GIF files"
DESCRIPTION = "Pure Python library which parses image files' header and returns the image size. \
 \
Supported formats: \
 * PNG \
 * JPEG \
 * JPEG2000 \
 * GIF"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-imagesize-2.0.0-2.1.noarch.rpm"
RPM_HASH = "5ff321b7a201ceea0c97c31f8fd56d88c5ed338272ad7df2ffcaa216886f3902f8c3eba30910b8606e7a0366356ff60eb3d0726c82c92fe4c7ec7bc4aac6a420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imagesize \
python314-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
