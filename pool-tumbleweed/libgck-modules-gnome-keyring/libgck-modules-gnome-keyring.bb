SUMMARY = "Glib wrapper library for PKCS#11 - Modules"
DESCRIPTION = "GCK is a wrapper based on GLib implementing the PKCS#11 (Cryptoki) \
interface. \
 \
This package contains various PKCS#11 modules, to expose keys and \
certificates from different sources."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "libgck-modules-gnome-keyring-50.0-3.2.aarch64.rpm"
RPM_HASH = "7fa52d332104eaa76f902c695d79e62a2d08f2f0656b4c48efce3586062601d4d8d4ef0c5331edf88dcf77b1218d956c130470cea616c5232f92ae2b45111638"

RPROVIDES:${PN} += "libgck-modules-gnome-keyring"

RDEPENDS:${PN} += "gck \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
