SUMMARY = "Documentation for OpenColorIO"
DESCRIPTION = "This package contains documentation for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.5.2"

RPM_NAME = "OpenColorIO-doc-2.5.2-1.2.noarch.rpm"
RPM_HASH = "654a702cdf9bc73d8da48c57f561360b0d9c29155a61c487411bd3645b5433d16b02fb49745989d05773ae0e95ae90236e2d1e5582371f400aee95f000391c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenColorIO-doc"

RDEPENDS:${PN} += ""

inherit rpm
