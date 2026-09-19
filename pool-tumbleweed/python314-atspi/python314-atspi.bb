SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.58.2"

RPM_NAME = "python314-atspi-2.58.2-1.3.noarch.rpm"
RPM_HASH = "c1aeb88e210bd92ac1b8926bb473ea0bb494545e9736ed6d29293680eee9513ade7b9b12f772b4ff52f0228f963e410fb63882930b9ef0a86f3a15074b2afe4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyatspi \
python314-atspi \
python3dist-pyatspi"

RDEPENDS:${PN} += "python-abi \
python314-dbus-python \
python314-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm
