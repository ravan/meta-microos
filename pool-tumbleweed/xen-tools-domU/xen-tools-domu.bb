SUMMARY = "Xen Virtualization: Control tools for domain U"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains tools that allow unprivileged domains to query \
the virtualized environment. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-tools-domU-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "9c32e43c14d0c2eb7f82eead1647cf262cc72e9e3b8bb1abddf835cbd53f80d32c32b45600ee43a3dd578e7c72d08c62f8fea12f7d7d9fc0b6d0c58b240ac08c"

RPROVIDES:${PN} += "config-xen-tools-domU \
xen-tools-domU"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxenctrl.so.4.22 \
libxenguest.so.4.22 \
libxenstore.so.4 \
xen-libs"

inherit rpm
