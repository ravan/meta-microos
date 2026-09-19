SUMMARY = "Python bindings for libcec"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling. \
 \
libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This package contains the Python bindings."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.7"

RPM_NAME = "python3-libcec-8.1.7-1.1.aarch64.rpm"
RPM_HASH = "6417d725e54b78f47723ce8d631b640625caae4ae9ec245764f308406b030346e7d698471ed5ca34f76928ada7993d6bba8943671eaccca0cd454e3661d20719"

RPROVIDES:${PN} += "python3-libcec"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcec.so.8 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
