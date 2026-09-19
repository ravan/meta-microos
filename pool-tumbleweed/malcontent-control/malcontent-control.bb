SUMMARY = "Parental Control Application"
DESCRIPTION = "Parental Control management application for Malcontent"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "malcontent-control-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "6d77859851aa9cc06bac4a202c174963e4c5f8c3f2ee08833943015781c1db53343cc898c8c62e46d2505ab71f9b38c06ab7219b1928c93f6b3250d051a1d673"

RPROVIDES:${PN} += "malcontent-control"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libmalcontent-ui-1.so.1 \
libpolkit-gobject-1.so.0 \
malcontent"

inherit rpm
