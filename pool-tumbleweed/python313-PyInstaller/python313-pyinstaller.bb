SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "6.20.0"

RPM_NAME = "python313-PyInstaller-6.20.0-1.3.aarch64.rpm"
RPM_HASH = "52129227411ac84ef08e3b54de660b6dd0ec43be50c197ee2eace84695c8ad68914ad0a6e4335884481c31ea47da0aaa7124a43d922d517219a411593f2cc230"

RPROVIDES:${PN} += "python3-PyInstaller \
python3.13dist-pyinstaller \
python313-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python313-altgraph \
python313-packaging \
python313-pyinstaller-hooks-contrib \
python313-setuptools \
update-alternatives"

inherit rpm
