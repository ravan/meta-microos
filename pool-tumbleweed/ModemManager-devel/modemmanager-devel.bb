SUMMARY = "Development files for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "ModemManager-devel-1.24.2-1.6.aarch64.rpm"
RPM_HASH = "be4c99f3234b30918fa2099a2e5510ed71cc6cb8bf5541f681de4cfceab22507f61af9c83f2afb83bc1c1f9999c2656c243a605f892aef4daee803a77156e9fc"

RPROVIDES:${PN} += "ModemManager-devel \
pkgconfig-ModemManager \
pkgconfig-mm-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ModemManager \
libmm-glib0 \
pkgconfig-ModemManager \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-ModemManager-1-0"

inherit rpm
