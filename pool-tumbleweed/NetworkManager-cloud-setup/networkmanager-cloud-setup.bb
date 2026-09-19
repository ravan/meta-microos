SUMMARY = "Automatically configure NetworkManager in cloud"
DESCRIPTION = "Installs a nm-cloud-setup tool that can automatically configure \
NetworkManager in cloud setups. Currently only EC2 is supported. \
This tool is still experimental."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-cloud-setup-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "4702780991abdefe5e9670d12dc2682d0e8b23baa57f3ece71c7eba76cbffb13a0cb3b11852aee795a245ddf769b63ad54cc046651755a55b736063a3f8e378e"

RPROVIDES:${PN} += "NetworkManager-cloud-setup"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libnm.so.0 \
libnm0"

inherit rpm
