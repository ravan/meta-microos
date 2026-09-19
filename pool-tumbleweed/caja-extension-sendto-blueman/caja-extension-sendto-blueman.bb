SUMMARY = "A sendto integration for Caja"
DESCRIPTION = "This package add sendto integration for Caja."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "caja-extension-sendto-blueman-2.4.6-1.5.noarch.rpm"
RPM_HASH = "4a3f82d9cc493f1d6b2845284296ebbd2343bba1ca56795a919e0ff6e45e8e685a470ab055f0fc73db01206898cd1e45c52f0adf8dd6f29bcffc433201301e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-Caja \
typelib-GObject \
typelib-Gio"

inherit rpm
