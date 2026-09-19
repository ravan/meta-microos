SUMMARY = "Documentation for texlive-accsupp"
DESCRIPTION = "This package includes the documentation for texlive-accsupp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-doc-2026.226.0.0.6svn53052-61.2.noarch.rpm"
RPM_HASH = "6f36eb2340c2b8706e4d4941ae377bd47e970170e6f08b3af1727d8ab7fcb9eef80d24291e42b7ebd9379d51c747abfd87fadab7bfe92a3ad60cd4d5ef779e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accsupp-doc"

RDEPENDS:${PN} += ""

inherit rpm
