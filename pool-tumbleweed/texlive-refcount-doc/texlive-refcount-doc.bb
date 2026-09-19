SUMMARY = "Documentation for texlive-refcount"
DESCRIPTION = "This package includes the documentation for texlive-refcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-refcount-doc-2026.226.3.6svn77682-60.4.noarch.rpm"
RPM_HASH = "4871ab1adb0d871aed381f0884b837e8008a4b3aae2208c5a55ce7e99b082317fc05d1e1bb994d7e1c00352f3e82d9912eb5f63e4e8c45f68485f3833cdc6cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
