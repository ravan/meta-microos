SUMMARY = "Utilities for Manipulating Desktop Files"
DESCRIPTION = "This packages contains a couple of command line utilities for \
working with desktop files. \
 \
More information about desktop files can be found at: \
http://freedesktop.org/wiki/Specifications/desktop-entry-spec"
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "desktop-file-utils-0.28-3.4.aarch64.rpm"
RPM_HASH = "3a7f5ad372f1d227cf51b06e808887c46bd32f3db5de184caafaf2931df98ff13ecffdfb51545d02aa2308b394816f965a8915787ed07e3d522e191c61d8f8f5"

RPROVIDES:${PN} += "desktop-file-utils \
rpm-macro-desktop-database-post \
rpm-macro-desktop-database-postun"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
awk \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
