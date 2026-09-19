SUMMARY = "Documentation for texlive-flexipage"
DESCRIPTION = "This package includes the documentation for texlive-flexipage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn66614"

RPM_NAME = "texlive-flexipage-doc-2026.226.1.02svn66614-59.2.noarch.rpm"
RPM_HASH = "6f40a2b9da3b2ed750611c8572660a23e8ed0155331a2a81af525f0fa7657d8c09a3910522c9c010f7229dfc06eaa706660a1e1b1f58f39ac13995f9bb200473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flexipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
