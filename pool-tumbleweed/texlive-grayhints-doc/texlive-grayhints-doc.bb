SUMMARY = "Documentation for texlive-grayhints"
DESCRIPTION = "This package includes the documentation for texlive-grayhints"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49052"

RPM_NAME = "texlive-grayhints-doc-2026.226.svn49052-60.4.noarch.rpm"
RPM_HASH = "70328ff99a5d0e4c9ec2bc564b362ef65ad9d9bca0075203572bb116f7530ce7ce888bdf2f972b4a7c1416a9413913197c7d8e9aa114a2b6f92810aa45c6457a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grayhints-doc"

RDEPENDS:${PN} += ""

inherit rpm
