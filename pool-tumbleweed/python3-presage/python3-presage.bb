SUMMARY = "Intelligent predictive text entry platform (Python binding)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package provides the Python binding for libpresage. \
 \
This package contains the Python extension module for libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presage-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "f87bb384f9d3be444b44d1388d19f167e8ac1a71c791302be7572c62b11226292beb84b51d1d361068fb8b9a79f17bb31d495b485a9e23a0bbb0bf5a9586e6b6"

RPROVIDES:${PN} += "python-presage \
python3-presage \
python3.13dist-python-presage \
python3dist-python-presage"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpresage.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
