SUMMARY = "XML Editor Development Files"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. It uses a tree-based \
interface to ease the edit of long files. \
 \
This package includes QXmlEdit development files."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.18.1"

RPM_NAME = "qxmledit-devel-0.9.18.1-1.1.aarch64.rpm"
RPM_HASH = "54cb4f5caa6ca4c3051cd2fb51756d58c6b79b1e47f251720a1af9a112be030b6e23ce3d8749da35787dde4d0e8a5abc29bef65bacf3405f29a99176cde6c25f"

RPROVIDES:${PN} += "qxmledit-devel"

RDEPENDS:${PN} += "libqxmledit0"

inherit rpm
