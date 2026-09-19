SUMMARY = "Client side libraries"
DESCRIPTION = "Shared libraries for accessing the libvirt daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-libs-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "0e00ed11e4bf00119a2fad6b13e17b93b1a0e49cef82339b2f12818bf0a03bf508295d26563b8658116dfb85d12c5a9123ca3650adf9b5a40490a1658b44b8a3"

RPROVIDES:${PN} += "config-libvirt-libs \
libvirt-admin.so.0 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
cyrus-sasl-digestmd5 \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libapparmor.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcurl.so.4 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libm.so.6 \
libnl-3.so.200 \
libnuma.so.1 \
libsasl2.so.3 \
libselinux.so.1 \
libssh.so.4 \
libssh2.so.1 \
libtirpc.so.3 \
libxml2.so.16"

inherit rpm
