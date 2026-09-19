SUMMARY = "Documentation for texlive-umthesis"
DESCRIPTION = "This package includes the documentation for texlive-umthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-doc-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "cb4f9fda7b5374e06821c46949607cc67fe7455f675c51352e3ff19a0330da077e017c9fc3513f7b2bb243c1915077fd5a45d959a044fc1c1cf7a72874c347ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
