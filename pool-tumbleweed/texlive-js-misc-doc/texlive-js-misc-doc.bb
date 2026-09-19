SUMMARY = "Documentation for texlive-js-misc"
DESCRIPTION = "This package includes the documentation for texlive-js-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16211"

RPM_NAME = "texlive-js-misc-doc-2026.226.svn16211-63.2.noarch.rpm"
RPM_HASH = "7c5a21a8c5c001d3776bc418201fd7476534bc52f7f8ed842fc6bcb059541342b9b7c9ae0499f89c9868dd0aa2bede20d4e37b1503a2788a2ff0297a75726352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-js-misc-doc"

RDEPENDS:${PN} += ""

inherit rpm
