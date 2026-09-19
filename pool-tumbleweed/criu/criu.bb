SUMMARY = "Checkpoint/Restore In Userspace Tools"
DESCRIPTION = "Checkpoint/Restore In Userspace, or CRIU, is a software tool for Linux \
operating system. Using this tool, you can freeze a running application \
(or part of it) and checkpoint it to a hard drive as a collection of \
files. You can then use the files to restore and run the application from \
the point it was frozen at."
LICENSE = "GPL-2.0-only"

PV = "4.2.1"

RPM_NAME = "criu-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "c21c128eba5296d7547e666b6aa581c4bfd54e793d802c368a2fdc6899e396966a9a2f544680c049f733d3cb2b689021861063a9c7710a5c24ac8d48010faac9"

RPROVIDES:${PN} += "criu \
python3.13dist-crit \
python3.13dist-pycriu \
python3dist-crit \
python3dist-pycriu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libgnutls.so.30 \
libnet.so.9 \
libnftables.so.1 \
libnl-3.so.200 \
libprotobuf-c.so.1 \
libselinux.so.1 \
libuuid.so.1 \
python-abi \
python3-protobuf"

inherit rpm
