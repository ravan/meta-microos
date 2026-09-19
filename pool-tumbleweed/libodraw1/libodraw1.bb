SUMMARY = "Library to access to optical disc (split) RAW image files"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libodraw1-20240505-1.24.aarch64.rpm"
RPM_HASH = "ba080f10179d5352ad4ff4d9f9c7b17db6a14ea57bc7579d314be5701c53993d635f019821ae3223caf685126be2e2eecf105997c6a2dd9963c8a023a7f6e385"

RPROVIDES:${PN} += "libodraw.so.1 \
libodraw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libuna.so.1"

inherit rpm
