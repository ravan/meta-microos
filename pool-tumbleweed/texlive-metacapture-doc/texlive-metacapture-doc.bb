SUMMARY = "Documentation for texlive-metacapture"
DESCRIPTION = "This package includes the documentation for texlive-metacapture"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77812"

RPM_NAME = "texlive-metacapture-doc-2026.226.0.0.9.1svn77812-61.2.noarch.rpm"
RPM_HASH = "f5c9bcdca19b4fd700c357357daffaa1f3a0c2c21bbbb7c1c018cd98c15c34a170045ec78c47222a4d08845bfa6cb36a158d82cee402507feec87c23b6452ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metacapture-doc"

RDEPENDS:${PN} += ""

inherit rpm
