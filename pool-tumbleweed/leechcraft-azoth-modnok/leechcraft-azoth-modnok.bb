SUMMARY = "LeechCraft Azoth LaTeX support Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
can render and display LaTeX formulae directly in chat windows. \
 \
It does not depend on the underlying protocol, and if the protocol supports \
rich text formatting in outgoing messages, it is able to replace the formulas \
with corresponding images in outgoing messages as well, so your buddies would \
see nice rendered formulas instead of raw LaTeX code, even if their client \
does not have a LaTeX formatter."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-modnok-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "789f8c70ba4e3b8736dd2ad84eb7c82ecbbc7065b31ec620b1687da7dd02615ff80916634d544853b2c05b5789202eab5b73e93c78a51559ba0f45ca0155dc36"

RPROVIDES:${PN} += "leechcraft-azoth-modnok \
libleechcraft-azoth-modnok.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
