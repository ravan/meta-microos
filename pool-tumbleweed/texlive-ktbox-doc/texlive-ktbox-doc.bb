SUMMARY = "Documentation for texlive-ktbox"
DESCRIPTION = "This package includes the documentation for texlive-ktbox"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.0.1svn76524"

RPM_NAME = "texlive-ktbox-doc-2026.226.0.0.0.1svn76524-63.2.noarch.rpm"
RPM_HASH = "dd566fb1ec4aaa6d2a260c4b6ba4f8809505ed8bbadc36d2f77b9b5df1c0bc8ecfbfdbd8a9fb501392f612648912e6e4a9d67bb399f85d840c4b8e07bffef29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ktbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
