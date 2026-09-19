SUMMARY = "Documentation for texlive-aesupp"
DESCRIPTION = "This package includes the documentation for texlive-aesupp"
LICENSE = "LPPL-1.3c"

PV = "2026.226.1svn58253"

RPM_NAME = "texlive-aesupp-doc-2026.226.1svn58253-61.2.noarch.rpm"
RPM_HASH = "2f63fcf0892b7729e241a51de5168b9a71dadcc39329df7e939f7d1ab5c545181b39adf29490748f53b742eca89d54aea846dedd6025fdb0c468ca77f76e4395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aesupp-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge \
/usr/bin/perl"

inherit rpm
