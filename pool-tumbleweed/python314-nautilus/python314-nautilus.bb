SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python314-nautilus-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "62983f02c12250748ab7e78487929f052f77e231d407fd5c56feb318aa10df6d38ab550085ca1657f5e22269043d3534e041bbe5a2d11b27cd2a79788df2a5cc"

RPROVIDES:${PN} += "python314-nautilus"

RDEPENDS:${PN} += "python314-gobject \
python314-nautilus-common-files \
typelib-Nautilus"

inherit rpm
