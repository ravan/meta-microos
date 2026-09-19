SUMMARY = "Documentation for texlive-datetime2-finnish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-finnish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-doc-2026.226.1.2svn47047-59.2.noarch.rpm"
RPM_HASH = "0c8081204d633c9df2d63697ccd36b46bf2dc755d7761c0342884007f1635dd4a725fe46f8564e247537448a4a7e6ae7941e7a978b2159bcdbab7b7866936bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
