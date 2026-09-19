SUMMARY = "Documentation for texlive-econometrics"
DESCRIPTION = "This package includes the documentation for texlive-econometrics"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39396"

RPM_NAME = "texlive-econometrics-doc-2026.226.1.0svn39396-61.4.noarch.rpm"
RPM_HASH = "98793d357eaddc5a3a97d6a207eee567cc8cbfbe795964d8c4eaf0d558f363df649c88b91dced1eec681a0d366d7baf4000e7db8ea64128a7a4778448b8693f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econometrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
