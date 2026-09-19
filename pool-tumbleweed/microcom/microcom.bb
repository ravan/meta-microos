SUMMARY = "Minimalistic terminal program"
DESCRIPTION = "microcom is a minimalistic terminal program for communicating with devices over \
a serial connection (e.g. embedded systems, switches, modems). It features \
connection via RS232 serial interfaces (including setting of transfer rates) as \
well as in 'Telnet mode' as specified in [RFC 2217]. \
 \
[RFC 2217]: https://tools.ietf.org/html/rfc2217"
LICENSE = "GPL-2.0-only"

PV = "2023.09.0.0"

RPM_NAME = "microcom-2023.09.0.0-1.8.aarch64.rpm"
RPM_HASH = "0a44eb6847ef70cbe6745b5c2f01b05d8a21c01906ad79a64456e14ffd2bf1a3ca6414694cf561c9dce45a75df610d3b96a5e30d8ac6672a312f98cec0a35d69"

RPROVIDES:${PN} += "microcom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
