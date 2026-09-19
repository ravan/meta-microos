SUMMARY = "Documentation for texlive-eukdate"
DESCRIPTION = "This package includes the documentation for texlive-eukdate"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn15878"

RPM_NAME = "texlive-eukdate-doc-2026.226.1.04svn15878-59.2.noarch.rpm"
RPM_HASH = "b63c483ea87c75a655f71848cecdab49114488e1ab5f8745d19bbf4455606975f0d2c270d457bed266d0b08fe85311ef943e0570989c2301ff4932af131ac19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eukdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
