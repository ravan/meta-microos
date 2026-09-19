SUMMARY = "Documentation for texlive-ifxptex"
DESCRIPTION = "This package includes the documentation for texlive-ifxptex"
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-doc-2026.226.0.0.2svn46153-60.2.noarch.rpm"
RPM_HASH = "43779bbf78ed96d817f75167aad75927e457f41401feed01a7022017389219c01d25bf9f974c01de53c6a69af8a7dd44f63bb48ac8e2eee13c34d8726ae3e79e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifxptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
