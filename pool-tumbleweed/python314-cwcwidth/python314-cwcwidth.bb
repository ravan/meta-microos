SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python314-cwcwidth-0.1.12-1.6.aarch64.rpm"
RPM_HASH = "54fd0e08310bb7f1133c865d991ad7c050d8ad978832ce896ed8592bfd6fb6bcafee4129ae7da95eac18cd826727d583351a27be457a9d536edfc1bc7c28e682"

RPROVIDES:${PN} += "python3.14dist-cwcwidth \
python314-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
