SUMMARY = "Simple X hotkey daemon"
DESCRIPTION = "sxhkd is a simple X hotkey daemon with a powerful and compact configuration syntax."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "sxhkd-0.6.2-1.19.aarch64.rpm"
RPM_HASH = "9c4d7778a59ca06f375960a1f5cd4f9f895ffc88fff0b1d6a0cda1f02e56af1e29fdb25ab399c6a620bf96db6ffa18f0221bf3c213eb068cf77948a57da11a6c"

RPROVIDES:${PN} += "config-sxhkd \
sxhkd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
