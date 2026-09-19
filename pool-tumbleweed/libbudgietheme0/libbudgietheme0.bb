SUMMARY = "Shared library for Budgie theming"
DESCRIPTION = "Budgie theming engine shared library package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgietheme0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "204f0b3b36dcfd673a64a74129a25888948cde68ec90bf53aca40f60c4eae302554ef0c5a0aefdc4254be02558a2ae8b95b2218f59546b3d8328468e62e4a1f6"

RPROVIDES:${PN} += "libbudgietheme.so.0 \
libbudgietheme0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
