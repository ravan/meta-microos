SUMMARY = "Python UNO Bridge for LibreOffice"
DESCRIPTION = "The Python-UNO bridge allows to use the standard LibreOffice API \
from the well known Python scripting language. It can be used to \
develop UNO components in python, thus python UNO components may be run \
within the LibreOffice process and can be called from Java, C++ or \
the built in StarBasic scripting language. You can create and invoke \
scripts with the office scripting framework (OOo 2.0 and later) with \
it. For example, it is used for the mail merge functionality. \
 \
You can find the more information at \
http://udk.openoffice.org/python/python-bridge.html"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-pyuno-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "6298601424a0cc6281dd8c47c487bb129e0aa3bef7a0491144cb4bc27539be58917cb0d6fbeeedcbeee6e6e0ab1463db4f0fd65530324bb84e069497cbbcf903"

RPROVIDES:${PN} += "config-libreoffice-pyuno \
libpythonloaderlo.so \
libpyuno.so \
libreoffice-pyuno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpython3.13.so.1.0 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
python-abi \
rtld-GNU-HASH"

inherit rpm
