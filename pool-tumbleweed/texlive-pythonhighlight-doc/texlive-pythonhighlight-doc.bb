SUMMARY = "Documentation for texlive-pythonhighlight"
DESCRIPTION = "This package includes the documentation for texlive-pythonhighlight"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70698"

RPM_NAME = "texlive-pythonhighlight-doc-2026.226.svn70698-60.4.noarch.rpm"
RPM_HASH = "6943c207bcc01cd075c172bb864cddfc80e3a9e683ef8aec623857008fbb44a5c52717a29aa917da89992e5ce21f905ab7682cee08f74b99ce13d4e7cd1de6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonhighlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
