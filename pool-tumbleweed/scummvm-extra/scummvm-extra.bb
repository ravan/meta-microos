SUMMARY = "Extra engines for ScummVM"
DESCRIPTION = "lastexpress and toltecs engines for ScummVM. \
These engines are in a worse state, but allow to play extra games."
LICENSE = "GPL-3.0-or-later"

PV = "2026.3.0"

RPM_NAME = "scummvm-extra-2026.3.0-1.1.aarch64.rpm"
RPM_HASH = "f770949cb5893896919c65dcf4dee759c32708d323f3e5a98284cd4e484ed7a3c7afbc6716ed84408a705284ea390a41ca184d78adf7f630b60be457269f8443"

RPROVIDES:${PN} += "liblastexpress.so \
libwintermute.so \
scummvm-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
scummvm"

inherit rpm
