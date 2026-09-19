SUMMARY = "Documentation for texlive-hyphen-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-hungarian"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-hungarian-doc-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "8bd36861cfed111624df19d3679d4b13ddc7a00681d76520a1041fd4644af3d1f8ce01d671c9920c025d1856e611d7909103db727b098c117e07a2c460a4efb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-hungarian-doc"

RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
