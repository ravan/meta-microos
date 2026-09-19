SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.2"

RPM_NAME = "python314-sane-2.9.2-1.6.aarch64.rpm"
RPM_HASH = "56cc9400220403ec3ebcfde12699296f640db225c7c5900900c4237677d7d6687512da513552fe8153441b01f36ef535577e4048bb6572bf4f808907f815b021"

RPROVIDES:${PN} += "python3.14dist-python-sane \
python314-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
