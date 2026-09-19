SUMMARY = "Documentation for VIPS library"
DESCRIPTION = "This package contains documentation about the VIPS library in HTML and PDF \
formats."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "vips-doc-8.18.5-1.3.noarch.rpm"
RPM_HASH = "0063dad16582a83682656734e83c2cc14a5ab9353d54990beae6df99cca0e8b512d0c2ddb627f18a8f8c6dd50009616f33df5213d46e0907164040a4b4212645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vips-doc"

RDEPENDS:${PN} += "libvips42"

inherit rpm
