SUMMARY = "Documentation for texlive-cabin"
DESCRIPTION = "This package includes the documentation for texlive-cabin"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cabin-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "907bf233bdb1fd7e2ab7fa6c2e1e9b40cdb7a5ac8870ea33f1b53a8f5e6ca3a0473681a5c7db606f3214ee6b4f41d6d436749ba06020a066f3c085fa04394959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cabin-doc"

RDEPENDS:${PN} += ""

inherit rpm
