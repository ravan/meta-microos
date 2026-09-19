SUMMARY = "Developer documentation for the XRootD libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the API documentation of the XRootD \
libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-doc-5.9.0-1.6.noarch.rpm"
RPM_HASH = "38983d0944816e1539a3344292fa1c20cb9e182142609b27740c33ed4a2a1bab11c7c3d0246f531c9e2c37fe2922452c7ae2ed61b661c57b0602fee185acf403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xrootd-doc"

RDEPENDS:${PN} += ""

inherit rpm
