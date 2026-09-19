SUMMARY = "Documentation for texlive-miama"
DESCRIPTION = "This package includes the documentation for texlive-miama"
LICENSE = "OFL-1.1"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-miama-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "45aeed60e2e5655937f0559a41f5065d64c865a155f9943539340c50cee417b3b5d6fe068a0b325981ad5dbf2ae57d2e34e71d77e3b05304554385f1fc04ddd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miama-doc"

RDEPENDS:${PN} += ""

inherit rpm
