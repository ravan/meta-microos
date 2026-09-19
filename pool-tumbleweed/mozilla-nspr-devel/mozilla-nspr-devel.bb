SUMMARY = "Netscape Portable Runtime development files"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.40"

RPM_NAME = "mozilla-nspr-devel-4.40-1.1.aarch64.rpm"
RPM_HASH = "2ec9177d4ba34617692d131679a0b6cde8c019ff58ba81c29c84346fa87356ad4b481fc8c4889f7fa6db4fb4dc9691c482a5fb8b57e946ee8439d6efeec6cdef"

RPROVIDES:${PN} += "mozilla-nspr-devel \
pkgconfig-nspr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
mozilla-nspr"

inherit rpm
