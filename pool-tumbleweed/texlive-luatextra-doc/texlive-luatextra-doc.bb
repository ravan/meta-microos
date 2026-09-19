SUMMARY = "Documentation for texlive-luatextra"
DESCRIPTION = "This package includes the documentation for texlive-luatextra"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0.1svn77682"

RPM_NAME = "texlive-luatextra-doc-2026.226.1.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "d672b51408385ed398ce9e91e87f869ff970bbe5c8a6d8302caec02f0df3c386dc284b5f5f4251650b7d2302833aecd684e0751a45fe04ef52664e8a877c6a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
