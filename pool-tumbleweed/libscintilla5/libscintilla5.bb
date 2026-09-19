SUMMARY = "A source code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. The selection margin can \
contain breakpoint markers and the current line. It can use \
proportional fonts, multiple fonts and different colors at the same \
time."
LICENSE = "MIT"

PV = "5.6.3"

RPM_NAME = "libscintilla5-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "1d87401dbf0c09579aac0676a5463fbc67992588345165f3d5a9cb9c5009e4157debdf1a0c611d9f99e1a97799ae0eb7ca1a3a978fe9b42eac888c72d744745a"

RPROVIDES:${PN} += "libscintilla.so.5 \
libscintilla5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
