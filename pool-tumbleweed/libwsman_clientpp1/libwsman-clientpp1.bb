SUMMARY = "C++ bindings to the OpenWSMAN client library"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides a C++ API library for OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "libwsman_clientpp1-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "ccb4309d021e7c2c713b9e9424e7292aa4db3140b54a8655a76c4aba2c388d29a9ecbae97db7cb82d7abdee851c01fe545d86734f6cd1cb44564d8b0eb15a207"

RPROVIDES:${PN} += "libwsman-clientpp.so.1 \
libwsman-clientpp1 \
openwsman-client"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
