SUMMARY = "Python 3 GI bindings for the LibBlockDev library"
DESCRIPTION = "This package contains enhancements to the GObject Introspection bindings for \
LibBlockDev, in Python 3."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "python3-libblockdev-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "da2082f101d402a9ba630ca96408b50edaa53a1866b4747cd12dbd31ff5420d470b7c8553c303d04ffd79645607946602cddb7e0b6bc11a4b630538b0c7af186"

RPROVIDES:${PN} += "python3-libblockdev"

RDEPENDS:${PN} += "python-abi \
python3-bytesize \
python3-gobject \
typelib-GLib \
typelib-GObject"

inherit rpm
