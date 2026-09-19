SUMMARY = "Documentation for texlive-lualibs"
DESCRIPTION = "This package includes the documentation for texlive-lualibs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.76svn67994"

RPM_NAME = "texlive-lualibs-doc-2026.226.2.76svn67994-59.2.noarch.rpm"
RPM_HASH = "a9f17a0753bda90cd9c30a3303d207a376c09dd2ffbd9d25dbdac4fd9c41354492dabdb0a6ad0aaa29ae50c6c5837d49bf3e337ba7f7aa16afc3abee034f1af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs-doc"

RDEPENDS:${PN} += ""

inherit rpm
