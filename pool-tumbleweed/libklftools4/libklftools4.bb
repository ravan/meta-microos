SUMMARY = "KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "libklftools4-4.1.0-1.26.aarch64.rpm"
RPM_HASH = "d4ad5bbb129a58150e52e0a3785eb679c64dfeb7c5d3a6116ceb4000c92a1c56cbae8556c8bf9170963b77a85511da45f8c2e0a8705eafe39e5598218abbb6c6"

RPROVIDES:${PN} += "libklftools \
libklftools.so.4 \
libklftools4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
