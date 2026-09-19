SUMMARY = "Shared library package of libvterm"
DESCRIPTION = "An abstract C99 library which implements a VT220 or xterm-like \
terminal emulator. It does not use any particular graphics toolkit or \
output system. Instead, it invokes callback function pointers that \
its embedding program should provide it to draw on its behalf."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "libvterm0-0.3.3-1.11.aarch64.rpm"
RPM_HASH = "439fa204fe12357e8660a6d9c8c14c96deb5a630c500575661f3033d06914accf3e11699a0c7c88515d36522ab94944d8702a6754611ce1cb3e8543c7d782b11"

RPROVIDES:${PN} += "libvterm.so.0 \
libvterm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
