SUMMARY = "Documentation for texlive-modes"
DESCRIPTION = "This package includes the documentation for texlive-modes"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.4svn77365"

RPM_NAME = "texlive-modes-doc-2026.226.4.4svn77365-61.2.noarch.rpm"
RPM_HASH = "11853adc083f05b684da41cda632797729758b40ae6e23cfac3d3e4085ce485988d659cd9942ad996602f9037a8be1fff573f4d501cbc316b5ee2148cb39fabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modes-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
