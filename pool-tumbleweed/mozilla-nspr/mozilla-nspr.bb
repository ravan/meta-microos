SUMMARY = "Netscape Portable Runtime"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.40"

RPM_NAME = "mozilla-nspr-4.40-1.1.aarch64.rpm"
RPM_HASH = "e7481ffc2f28eb08c5cb19cd717af6e873c668b0a74e078408468b53edaf32dedf8d01ab1836e526ee66c31a52cdf2b3eeca5c07d36ebbf13f71bc44098816da"

RPROVIDES:${PN} += "libnspr4.so \
libplc4.so \
libplds4.so \
mozilla-nspr"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
