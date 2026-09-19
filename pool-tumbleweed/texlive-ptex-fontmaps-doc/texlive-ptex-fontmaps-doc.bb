SUMMARY = "Documentation for texlive-ptex-fontmaps"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fontmaps"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-doc-2026.226.20210625.0svn65953-60.4.noarch.rpm"
RPM_HASH = "2b42ef29eb4a96fc2a10959c7cfeabb7d1789f2e3ea72201910c8001acf3e3ffb6c0f259cd4a2e92ecef7477d4cb886d47f36d3fd7368d5ec582c717e5f6f3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
