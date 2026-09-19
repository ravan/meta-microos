SUMMARY = "Documentation for texlive-morewrites"
DESCRIPTION = "This package includes the documentation for texlive-morewrites"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-morewrites-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ecbc4a264083189c15b79ef779bbe072d0516e8b3767b858059566259e084b7e2454b7e6532ca121a02f4e904fd7932e0fccd4e6ace83134bce19d7107e57735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morewrites-doc"

RDEPENDS:${PN} += ""

inherit rpm
