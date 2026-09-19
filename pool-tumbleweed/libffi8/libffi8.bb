SUMMARY = "Foreign Function Interface Library"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "libffi8-3.5.2-2.4.aarch64.rpm"
RPM_HASH = "004c66a3eb92ae38cf6f0dd65342e2b31488f7e94e15cab1cc933323df69b19d9a1e4c68edce81d0205926d0e24dd6ef56e4e353d0439e6b3465a632508fa83b"

RPROVIDES:${PN} += "libffi.so.8 \
libffi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
