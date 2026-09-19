SUMMARY = "Documentation for texlive-josefin"
DESCRIPTION = "This package includes the documentation for texlive-josefin"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-josefin-doc-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "6ee55fa4c4cdd9b0a3ba7d3d05e8e6edd54ad336ed32de643d1358bded5212c2fbdb1b0397035848cdbfd6357312d063f8a92d512a45a18f6e9d276194e037f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-josefin-doc"

RDEPENDS:${PN} += ""

inherit rpm
