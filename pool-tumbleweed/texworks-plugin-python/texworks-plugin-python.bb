SUMMARY = "Plugins to add python scripting to texworks"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X. \
 \
This package adds python scripting abitilies to TeXworks."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.11"

RPM_NAME = "texworks-plugin-python-0.6.11-1.3.aarch64.rpm"
RPM_HASH = "d81a20d94d55fb10a00f2e8eaf4b71d5affde062332de84aa137199561b2055018c4f0002072436d62cb3ea5ac0e3a2f8f905b8153fc5739b0ad96c4f907c41b"

RPROVIDES:${PN} += "libTWPythonPlugin.so \
texworks-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python3 \
texworks"

inherit rpm
