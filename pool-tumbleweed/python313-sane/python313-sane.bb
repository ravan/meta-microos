SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.2"

RPM_NAME = "python313-sane-2.9.2-1.6.aarch64.rpm"
RPM_HASH = "3055442099c7db72b8a15e13c6252a8f33310acf61479b25c4efb05afc5ea5d81db7cea75f8608e549ab6347b2992ae0393de3a70ee74b6e5f5ab959e9f19406"

RPROVIDES:${PN} += "python3-sane \
python3.13dist-python-sane \
python313-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
