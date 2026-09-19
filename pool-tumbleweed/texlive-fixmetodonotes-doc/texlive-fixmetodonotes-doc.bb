SUMMARY = "Documentation for texlive-fixmetodonotes"
DESCRIPTION = "This package includes the documentation for texlive-fixmetodonotes"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-doc-2026.226.0.0.2.2svn30168-59.2.noarch.rpm"
RPM_HASH = "957770c6a704e7ce23a7671f44ac26c9f9a94cd1ebf3916e8cb442b7f9ecedfe4f1709c59de0e1508e13ccb4b0843362bf743efadeb07c95079471abd2a08c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmetodonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
