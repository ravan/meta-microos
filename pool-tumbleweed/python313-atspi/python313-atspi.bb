SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.58.2"

RPM_NAME = "python313-atspi-2.58.2-1.3.noarch.rpm"
RPM_HASH = "8cfc84fb0a685b2ac9c95108543dab4990c669e5488844e9e85e2c4ff792dffe28b9ced65163f5c44196987cab18795efe882bd0879ca32cf474a819fd821525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3atspi \
python3-atspi \
python3.13dist-pyatspi \
python313-atspi \
python3dist-pyatspi"

RDEPENDS:${PN} += "python-abi \
python313-dbus-python \
python313-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm
