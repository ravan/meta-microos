SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20231205"

RPM_NAME = "libpff1-20231205-2.30.aarch64.rpm"
RPM_HASH = "2e6face79edb015ab6cbddbf523f811ef963272e210805099d23f7dfdb0f5e0419cb09b899c1f4bbfe7ebab087f4f0b4860053471c63de509b4e0ed6905699e3"

RPROVIDES:${PN} += "libpff.so.1 \
libpff1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfmapi.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
