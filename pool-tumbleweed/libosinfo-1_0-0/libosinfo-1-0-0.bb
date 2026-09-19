SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.0"

RPM_NAME = "libosinfo-1_0-0-1.12.0-3.6.aarch64.rpm"
RPM_HASH = "956c01e031125db93fbbe13bd5fd9607fe517ffc9527ff2c4368295f256236c250d249c8ddd287839cc7dfc854b7b3b47cb7680e753140855d103ee8924f6919"

RPROVIDES:${PN} += "libosinfo-1-0-0 \
libosinfo-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libosinfo \
libsoup-3.0.so.0 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
