SUMMARY = "Documentation for qt6-quick3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b41f0447b1080198d080a147c4cd8fc9da6f34c0e8797615710b304635ce5ba462d61d05c9a67b593311c275037b9afac0eb35755b3f52561cf9f37463ac7967"

RPROVIDES:${PN} += "qt6-quick3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
