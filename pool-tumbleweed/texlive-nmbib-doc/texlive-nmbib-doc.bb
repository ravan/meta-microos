SUMMARY = "Documentation for texlive-nmbib"
DESCRIPTION = "This package includes the documentation for texlive-nmbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-nmbib-doc-2026.226.1.05svn77682-61.2.noarch.rpm"
RPM_HASH = "4f1f2ba862e39805a47045b16df11d51b54bca007ecc5d6baeee515f5ab3f30c36fc4275e94626c452ede0cefdb292e5a7a6c6dbc28d1d31a26e2e604ca3246a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nmbib-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
