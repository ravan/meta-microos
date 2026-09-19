SUMMARY = "Library for access the Windows Hibernation File format"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr1-20210421-3.35.aarch64.rpm"
RPM_HASH = "5d0418de8a3e63cfbaee74cd7daeee308b9ed9a7622c73b68df2d0ad7b93a65c95f9523a5c01f9c87740bfa11f7fe562edbb1b0ce9a503fd25c1021e92170bc6"

RPROVIDES:${PN} += "libhibr.so.1 \
libhibr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1"

inherit rpm
