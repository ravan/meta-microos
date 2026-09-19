SUMMARY = "Share libraries of gcin"
DESCRIPTION = "This package provides runtime libraries for gcin."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "libgcin-im-client1-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "c8eb3a1f43925c9b47cbb168b7301e4db95c09ae772cb26564f38b7601df1dbe879beb3a3b89fd2f4bf6fe5a177ac57d37c8d6c723b32fdcacaa6d5eb8a7721d"

RPROVIDES:${PN} += "libgcin-im-client.so.1 \
libgcin-im-client1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
