SUMMARY = "Library to look up words in dictionary sources"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "libmatedict6-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "bc6b178dc5ab5accf42035e1dec851623c462a08566f9fa258c44377d1df5cf70db39dd274d4fadd9a44c517635dbd146232dc65ded22eb0961edda75aa57749"

RPROVIDES:${PN} += "libmatedict.so.6 \
libmatedict6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
