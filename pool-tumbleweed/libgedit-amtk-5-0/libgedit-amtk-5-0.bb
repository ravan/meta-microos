SUMMARY = "Shared Library for AMTK"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides the AMTK Shared Library"
LICENSE = "LGPL-3.0-or-later"

PV = "5.10.0"

RPM_NAME = "libgedit-amtk-5-0-5.10.0-1.3.aarch64.rpm"
RPM_HASH = "daf399a28bbda4395bb32a182f8a7fd1a38de235f799b9d82340108efa7feab056fa8484602e2b8888c4892583f1be7da0c47365b3ca6b1e8e94a15e99dd166f"

RPROVIDES:${PN} += "libgedit-amtk-5 \
libgedit-amtk-5-0 \
libgedit-amtk-5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
