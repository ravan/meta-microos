SUMMARY = "Documentation for texlive-bfh-ci"
DESCRIPTION = "This package includes the documentation for texlive-bfh-ci"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.6svn77879"

RPM_NAME = "texlive-bfh-ci-doc-2026.226.2.2.6svn77879-61.2.noarch.rpm"
RPM_HASH = "39bfee6ba5da108e98363c1600c744c1caee4ee54c934b28194c5dbee7c3d634ac2bfb9176af87a76eea61316bc57b6ddded118eccfa141d8888bf6533aae57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bfh-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
