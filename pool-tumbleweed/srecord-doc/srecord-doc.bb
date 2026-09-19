SUMMARY = "Srecord PDF documentation"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations. \
 \
This package contains documentation in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "1.65.0"

RPM_NAME = "srecord-doc-1.65.0-2.7.noarch.rpm"
RPM_HASH = "5fee5d86bca0717ee66bc16b0c2286e915b8d326a70ca071fda805f2bd132496add011f055464583e16a222dacdca614ebf8d98026ff55c0f82869cdb8c25ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "srecord-doc"

RDEPENDS:${PN} += ""

inherit rpm
