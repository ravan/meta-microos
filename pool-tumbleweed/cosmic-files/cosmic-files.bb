SUMMARY = "COSMIC file manager"
DESCRIPTION = "File manager for the COSMIC desktop environment"
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-files-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "e9caf370c281bb34ab43ee2358c0c856e332c2bbd5bd8f00894cfef9dd190d1f4b73b5de6381392662ace2765e89a38eafaf2f2321b0809e527f2bfdb3dc342b"

RPROVIDES:${PN} += "cosmic-files"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
