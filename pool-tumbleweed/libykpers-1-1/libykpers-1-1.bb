SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-1-1-1.20.0-3.18.aarch64.rpm"
RPM_HASH = "7a7bdb568fd66b1b184737710e29e5204c1fcd369db0cfd128210da117723ef56ce28c6ae97c973816ccee8e42da867c416b6caaf63219b0b6405a85011bb849"

RPROVIDES:${PN} += "libykpers-1-1 \
libykpers-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libusb-1.0.so.0 \
libyubikey.so.0"

inherit rpm
