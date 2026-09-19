SUMMARY = "Library files for pantheon-code"
DESCRIPTION = "Extensible Text Editor for the Pantheon Desktop. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.2"

RPM_NAME = "libcodecore0-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "aff5b87b7131d74bfd2f67a7fafcbe16bea18a5163f2650380e57bec6e461314efb8c90ccd69bcff69a771effa35f6fb2be0ac9e8ffb0a3a538ce02fcfcd34d5"

RPROVIDES:${PN} += "libcodecore.so.0 \
libcodecore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpeas-2.so.0 \
libvala-0.56.so.0 \
libvte-2.91.so.0"

inherit rpm
