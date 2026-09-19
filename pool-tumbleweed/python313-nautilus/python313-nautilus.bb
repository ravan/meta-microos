SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python313-nautilus-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "3b9f0c0e830f7cabfbd1ce782e634b49acbab97ecbbf79eb18a4aa54aeda376ba4962fc65b10a164ba726b5292f671012f5d85534c84b21574a2e1f1f76eb9ff"

RPROVIDES:${PN} += "python3-nautilus \
python313-nautilus"

RDEPENDS:${PN} += "python313-gobject \
python313-nautilus-common-files \
typelib-Nautilus"

inherit rpm
