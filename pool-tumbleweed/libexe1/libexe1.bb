SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libexe1-20260705-1.2.aarch64.rpm"
RPM_HASH = "a94df02065427e1083cfa80c3caf930a87534843cdd82f3244054b5c655ff88be712aefa6561abd8c587f08e3e164e43db3da7f7b3a8721b3cf7e46f64c0a21e"

RPROVIDES:${PN} += "libexe.so.1 \
libexe1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
