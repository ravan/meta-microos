SUMMARY = "A gaphical application for generating images from LaTeX equations"
DESCRIPTION = "KLatexFormula is a graphical user interface for generating images \
from LaTeX equations. These images can be dragged and dropped or copied and \
pasted into external applications (presentations, text documents, graphics...), \
or can be saved to disk in a variety of formats (PNG, JPG, BMP, EPS, PDF, etc.). \
 \
If the 'cm-unicode' LaTeX package is installed, KLatexFormula can use LaTeX's \
Computer Modern Sans Serif font as a default application font."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klatexformula-4.1.0-1.26.aarch64.rpm"
RPM_HASH = "c3e363f0b716fc1092f09ac840aaad97843cabdc900c9ff6ed8964ec6a0c22a86ceb57badd4c0a5ad6bc938fc7237c0d9d25499484ee9f0db902d56ecc7f8949"

RPROVIDES:${PN} += "KLatexFormula \
klatexformula \
klatexformula-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libklfbackend.so.4 \
libklfbackend4 \
libklftools.so.4 \
libklftools4 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
