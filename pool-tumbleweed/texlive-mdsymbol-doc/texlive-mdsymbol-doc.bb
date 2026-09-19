SUMMARY = "Documentation for texlive-mdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-mdsymbol-doc-2026.226.0.0.5svn77682-59.2.noarch.rpm"
RPM_HASH = "008a279fa9a4e4c34fad4067975d4106c2c617459e47f9aaa933f9511653ed59d5cb6e1cfcbe6dbfa180c620ee0c6c79bc2de8a74ce6291432e45d9f9ed30152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
