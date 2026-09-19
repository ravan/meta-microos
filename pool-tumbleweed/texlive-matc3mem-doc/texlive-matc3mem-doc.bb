SUMMARY = "Documentation for texlive-matc3mem"
DESCRIPTION = "This package includes the documentation for texlive-matc3mem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35773"

RPM_NAME = "texlive-matc3mem-doc-2026.226.1.1svn35773-59.2.noarch.rpm"
RPM_HASH = "56b17a944f0c2f1deb5556f8054b8b06c2d12835e608b24d6575097f8da81313ba87bd82eff2b85b497de7629a2c54794dec5e3f281e522f991ff64f46fad459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matc3mem-doc-it \
texlive-matc3mem-doc"

RDEPENDS:${PN} += ""

inherit rpm
