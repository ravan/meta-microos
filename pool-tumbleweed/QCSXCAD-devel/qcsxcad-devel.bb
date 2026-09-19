SUMMARY = "Development files for QCSXCAD"
DESCRIPTION = "A Qt-GUI for the CSXCAD library. \
 \
This package contains libraries and header files for developing \
applications that use QCSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "QCSXCAD-devel-0.6.3-4.1.aarch64.rpm"
RPM_HASH = "67905ec3f5b1f4a7ce4639dc5abbc14ac5f12cd07bfcf7902818dd65d2f92c64222d12d78b50db021bb30ec9b372a45aee493b968b01f56f06970ab63922193a"

RPROVIDES:${PN} += "QCSXCAD-devel"

RDEPENDS:${PN} += "libQCSXCAD0"

inherit rpm
