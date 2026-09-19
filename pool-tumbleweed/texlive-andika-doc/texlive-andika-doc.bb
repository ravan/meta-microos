SUMMARY = "Documentation for texlive-andika"
DESCRIPTION = "This package includes the documentation for texlive-andika"
LICENSE = "OFL-1.1"

PV = "2026.226.6.101svn77682"

RPM_NAME = "texlive-andika-doc-2026.226.6.101svn77682-61.2.noarch.rpm"
RPM_HASH = "67b0fa1bfb8b1614c632c70d836511449b13af4d21434d9e0dce45a53ca29aad4d404a94e1fac3c9fc1929378bac9914ad7ed5c5eba39b130ee14bf15b814e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-andika-doc"

RDEPENDS:${PN} += ""

inherit rpm
