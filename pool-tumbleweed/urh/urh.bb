SUMMARY = "Tool for investigating unknown wireless protocols"
DESCRIPTION = "The Universal Radio Hacker is a software for investigating unknown wireless \
protocols."
LICENSE = "GPL-3.0-only"

PV = "2.10.0"

RPM_NAME = "urh-2.10.0-1.6.aarch64.rpm"
RPM_HASH = "51bbdbb2ee1a02eef9d8e7c5bf9a58121a5a3cedaa65f374ee9fe481c4f620ffd9e95e72b031ac36022e1b29f98086342e14d9eb4ed61df833674ed99098897b"

RPROVIDES:${PN} += "python3.13dist-urh \
python3dist-urh \
urh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libLimeSuite.so.23.11-1 \
libairspy.so.0 \
libbladeRF.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhackrf.so.0 \
libiio.so.0 \
libm.so.6 \
librtlsdr.so.0 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
python-abi \
python3-Cython0 \
python3-PyAudio \
python3-PyQt6 \
python3-numpy \
python3-psutil \
python3-pyzmq"

inherit rpm
