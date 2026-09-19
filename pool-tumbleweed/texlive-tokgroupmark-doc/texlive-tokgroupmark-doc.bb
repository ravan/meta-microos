SUMMARY = "Documentation for texlive-tokgroupmark"
DESCRIPTION = "This package includes the documentation for texlive-tokgroupmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77946"

RPM_NAME = "texlive-tokgroupmark-doc-2026.226.1.0svn77946-59.2.noarch.rpm"
RPM_HASH = "bf8f8c49eb46429c889a717d052d4118206e7c5acf2c14a5130158dfe490685132f28ea16b98fae3303959b2acc20f1e948b21dab6c6511ddf7172c457f07550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokgroupmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
