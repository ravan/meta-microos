SUMMARY = "Documentation for the librvngabw API"
DESCRIPTION = "This package contains documentation for the librvngabw API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-doc-0.0.3-2.11.noarch.rpm"
RPM_HASH = "3f9e5f5ba2bfa7680ff72b13821bdfe149d61b618619688496661b26ac6955f9ca224ca772f742528780714671c91a985fff2b9526d098de7175bb9ded052dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librvngabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
