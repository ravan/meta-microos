SUMMARY = "UPnP integration for the MATE Desktop file manager"
DESCRIPTION = "This package provides the functionality to the Caja file manager to \
send files over e-mail or instant messaging protocols via Evolution, \
Empathy and Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-sendto-upnp-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "a78f54c36d7baad86dd383229a3390b408b38feea50c390c7e22afec1b01f7c8ba147207ac3340a911cdef23c053677f96dc71f75be0cc3b1b336ae814c4083f"

RPROVIDES:${PN} += "caja-extension-sendto-upnp \
caja-sendto-upnp \
libnstupnp.so \
mate-file-manager-sendto-upnp"

RDEPENDS:${PN} += "caja-extension-sendto \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgtk-3.so.0 \
libgupnp-1.6.so.0"

inherit rpm
