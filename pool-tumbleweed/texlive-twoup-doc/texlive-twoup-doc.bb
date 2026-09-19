SUMMARY = "Documentation for texlive-twoup"
DESCRIPTION = "This package includes the documentation for texlive-twoup"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn15878"

RPM_NAME = "texlive-twoup-doc-2026.226.1.3svn15878-59.2.noarch.rpm"
RPM_HASH = "f2f8d89108498d7bbf8570d1f656b2cd6dae4efad1f9a1d228b196390a054f9d93f517cc66c335fcf70fbbc9e9338352a01a9f5b65ebef24f057ccfdfc335219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoup-doc"

RDEPENDS:${PN} += ""

inherit rpm
