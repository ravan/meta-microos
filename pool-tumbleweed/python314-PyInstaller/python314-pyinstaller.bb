SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "6.20.0"

RPM_NAME = "python314-PyInstaller-6.20.0-1.3.aarch64.rpm"
RPM_HASH = "9b8b9ced2d0c353dd8280de9c6a87b74326a75ef8a0c0f77070f62017f3fde542d24804137a3f1f080c2d11d0f7087d3c070aad8413de92bedb31c8b31596910"

RPROVIDES:${PN} += "python3.14dist-pyinstaller \
python314-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python314-altgraph \
python314-packaging \
python314-pyinstaller-hooks-contrib \
python314-setuptools \
update-alternatives"

inherit rpm
