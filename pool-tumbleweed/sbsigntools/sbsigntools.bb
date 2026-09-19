SUMMARY = "Canonical EFI binary signing tools"
DESCRIPTION = "This package installs tools which can cryptographically sign EFI \
binaries and drivers."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "sbsigntools-0.9.5-3.3.aarch64.rpm"
RPM_HASH = "8c5d9d4c305717edae183bc7b1b217636145501ad0c6540ca46e6919b8851306f0894472986be82c61a632848cedf3755d97054527f49563762670d32adf8dbd"

RPROVIDES:${PN} += "sbsigntools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1"

inherit rpm
