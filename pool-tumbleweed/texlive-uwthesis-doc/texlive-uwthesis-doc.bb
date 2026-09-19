SUMMARY = "Documentation for texlive-uwthesis"
DESCRIPTION = "This package includes the documentation for texlive-uwthesis"
LICENSE = "Apache-1.0"

PV = "2026.226.6.13svn15878"

RPM_NAME = "texlive-uwthesis-doc-2026.226.6.13svn15878-60.2.noarch.rpm"
RPM_HASH = "03a335464647a0c0f7440b57751514c69035ea722a4d8b41c4fb40933765d908cf8b9ca67eb8655b78aa8c4e4a73a359a0a2b3fc1ce88e11f4504cdca93fdddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
