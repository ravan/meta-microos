SUMMARY = "Tools to create anonymous, machine-friendly problem reports"
DESCRIPTION = "Satyr is a library that can be used to create and process microreports. \
Microreports consist of structured data suitable to be analyzed in a fully \
automated manner, though they do not necessarily contain sufficient information \
to fix the underlying problem. The reports are designed not to contain any \
potentially sensitive data to eliminate the need for review before submission."
LICENSE = "GPL-2.0-or-later"

PV = "0.43"

RPM_NAME = "libsatyr4-0.43-5.6.aarch64.rpm"
RPM_HASH = "799df3430a329590fe663a0a0e4ddd22707e60a9b9fed35ec5087db8ba8616589f0f5e1a442cca910fe7179080010efc3bcdd4596689c1c669d9f9d5190c89b5"

RPROVIDES:${PN} += "libsatyr.so.4 \
libsatyr4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libglib-2.0.so.0 \
libjson-c.so.5 \
librpm.so.10 \
libstdc++.so.6"

inherit rpm
