SUMMARY = "Python nautilus files shared between python interpreter versions"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python-nautilus-common-files-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "617838f977c1017ac1bc16b11689afab3615e85892ad8c2840cb1af5d65e6948181f043885d6aaed2cb8c5346635546c393ed44e95d2aef568665254fbc16ba7"

RPROVIDES:${PN} += "libnautilus-python.so \
python-nautilus-common-files \
python313-nautilus-common-files \
python314-nautilus-common-files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libpython3.13.so.1.0"

inherit rpm
