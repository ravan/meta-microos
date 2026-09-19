SUMMARY = "Documentation for texlive-cell"
DESCRIPTION = "This package includes the documentation for texlive-cell"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-cell-doc-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "2c747a83ab882d417c53609004be3d484175ac9deb2d0541abf0ba7b78fd7e1ad4c6ca5cf598c973365f9840ff3a940f2925fe56da3d2a0f662565b678745371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cell-doc"

RDEPENDS:${PN} += ""

inherit rpm
