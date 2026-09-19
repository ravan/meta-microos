SUMMARY = "Tools for tk"
DESCRIPTION = "The Tix library has, by far, the greatest collection of widgets for \
programming with Tcl/Tk. Highlights include: hierarchical list box, \
directory list/tree view, spreadsheet, tabular list box, combo box, \
Motif style file select box, MS Windows style file select box, paned \
window, note book, spin control widget and many more. With these new \
widgets, your applications will look great and interact with your users \
in intuitive ways."
LICENSE = "BSD-3-Clause"

PV = "8.4.3"

RPM_NAME = "tix-8.4.3-75.8.aarch64.rpm"
RPM_HASH = "49e5adee610b24b50035e0440f39bdadeeb679098061df4c998f7a4a0d356157061877b34f671e146536ce0a1390c68e391f99b47a37ccfb6c224b1a23e5b0ce"

RPROVIDES:${PN} += "libTix8.4.3.so \
tix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tcl \
tk"

inherit rpm
