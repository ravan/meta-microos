SUMMARY = "Documentation for texlive-babel"
DESCRIPTION = "This package includes the documentation for texlive-babel"
LICENSE = "LPPL-1.0"

PV = "2026.226.26.3svn77829"

RPM_NAME = "texlive-babel-doc-2026.226.26.3svn77829-60.2.noarch.rpm"
RPM_HASH = "54d26de57ad0884a8dec2f3fd26fcf95417681723404f6a24edd1634aea9b1b3f95f4d50c9549e18938926937b40a629453f0b37755935b2dca52d147a069264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-doc"

RDEPENDS:${PN} += ""

inherit rpm
