SUMMARY = "Fast ISO8601 date time parser for Python written in C"
DESCRIPTION = "Fast ISO8601 date time parser for Python written in C"
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "python314-ciso8601-2.3.3-1.7.aarch64.rpm"
RPM_HASH = "e12bd7f756444f2f9e6764ca327f2d0e01aeb82679b6067b285ba8954b4c6150f2e26744d33c2a6769c71d511e92d4ac2061c74c00146d9727e94ad939afa012"

RPROVIDES:${PN} += "python3.14dist-ciso8601 \
python314-ciso8601 \
python3dist-ciso8601"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
