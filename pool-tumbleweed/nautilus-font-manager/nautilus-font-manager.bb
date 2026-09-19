SUMMARY = "Nautilus extension for Font Manager"
DESCRIPTION = "This package provides integration with the Nautilus file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "nautilus-font-manager-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "aec189709f3fe6b76858d9025dd01c8032ca1e2825641613e7170abb89757162832e205ed0f999de0a70ac565357835c145b3363e70bae8e13669059f0ead3af"

RPROVIDES:${PN} += "nautilus-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4"

inherit rpm
