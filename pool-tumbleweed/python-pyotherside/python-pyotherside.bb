SUMMARY = "Asynchronous Python 3 Bindings for Qt 5"
DESCRIPTION = "A QML Plugin that provides access to a Python 3 interpreter from QML."
LICENSE = "ISC"

PV = "1.6.2"

RPM_NAME = "python-pyotherside-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "d6ff0be65cd587559a96d944580280b8e19225afecc11b95e9095b7293e9443a2513b41de9134101f44475f756995e7dadc6e69746331b6cbe3de621416a3de6"

RPROVIDES:${PN} += "libpyothersideplugin.so \
pyotherside \
python-pyotherside \
python3-pyotherside \
qt5qmlimport-io.thp.pyotherside.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
