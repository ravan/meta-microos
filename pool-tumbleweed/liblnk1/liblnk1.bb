SUMMARY = "Library to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "liblnk1-20260525-1.10.aarch64.rpm"
RPM_HASH = "9a2d9b00857cebb3deb615d2191947f6da34bfcf44838575b4a706660c65829189c888953c8b6c8694f1b08bf7f8e344f11b757e08f7a00fdfc8e96810253e42"

RPROVIDES:${PN} += "liblnk.so.1 \
liblnk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libuna.so.1"

inherit rpm
