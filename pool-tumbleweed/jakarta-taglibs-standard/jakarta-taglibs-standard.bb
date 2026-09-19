SUMMARY = "Open Source Implementation of the JSP Standard Tag Library"
DESCRIPTION = "This package contains releases for the 1.1.x versions of the Standard \
Tag Library, Jakarta Taglibs's open source implementation of the JSP \
Standard Tag Library (JSTL), version 1.1. JSTL is a standard under the \
Java Community Process."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-1.1.2-3.9.noarch.rpm"
RPM_HASH = "20842d066d63a871178da7ca325164782170410d1eea2570a38340947618dbfdfc8d834932d4871e7ccade0aff87a8ee0142d0b5752b8a7d508cdd9f8d6187d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard"

RDEPENDS:${PN} += "servletapi5 \
xalan-j2"

inherit rpm
