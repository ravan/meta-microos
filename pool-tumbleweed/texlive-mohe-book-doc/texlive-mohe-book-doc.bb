SUMMARY = "Documentation for texlive-mohe-book"
DESCRIPTION = "This package includes the documentation for texlive-mohe-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74912"

RPM_NAME = "texlive-mohe-book-doc-2026.226.1.0.0svn74912-61.2.noarch.rpm"
RPM_HASH = "5814af355df47dbe0255e952c4006b1755e7ac5dd5713cb95a8f834b5be8f10b6c4abd9ba7692e11df08973e7c3134dc399188b8b50ccd7cf8418e1e2dd65ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mohe-book-doc-fa \
texlive-mohe-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
