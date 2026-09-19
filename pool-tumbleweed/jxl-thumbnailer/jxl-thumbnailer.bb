SUMMARY = "Generate thumbnails for JPEG XL files"
DESCRIPTION = "This package provides a thumbnailer to render for JPEG XL file thumbnails, \
for example, on file-browsers."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "jxl-thumbnailer-0.12.0-1.1.noarch.rpm"
RPM_HASH = "5487a608350e6a724a64e84cd39ee378b8f07db88fb3ef48144eb46b73deb9038715fe9009b1216e38f80a3fec034ded9c1c6b0f7e357f3e773df60b45140e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jxl-thumbnailer"

RDEPENDS:${PN} += ""

inherit rpm
