SUMMARY = "Lightweight Task Manager"
DESCRIPTION = "LXTask is a lightweight Task Manager. \
This is the default LXDE task manager."
LICENSE = "GPL-2.0-only"

PV = "0.1.10"

RPM_NAME = "lxtask-0.1.10-1.24.aarch64.rpm"
RPM_HASH = "6da39a4e5824a88d5ad7b3d409515f759b9879ea9c4ce4ba4b57a4b330783c131bf9401c5e7d7e055123ea3c8f1670d473521976048c7dfcd6719fa0898bd590"

RPROVIDES:${PN} += "lxtask"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
