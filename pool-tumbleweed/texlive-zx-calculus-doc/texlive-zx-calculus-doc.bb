SUMMARY = "Documentation for texlive-zx-calculus"
DESCRIPTION = "This package includes the documentation for texlive-zx-calculus"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn70647"

RPM_NAME = "texlive-zx-calculus-doc-2026.226.2.3svn70647-59.4.noarch.rpm"
RPM_HASH = "d2faaa1b9e99dfdffbed256c8d28bc9d93af9b4a543e9f742204d76220d5b113fc16efcf1da311a5b6b97702c83280c2c4de23336bc59bdb4c914ab2f74e9edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zx-calculus-doc"

RDEPENDS:${PN} += ""

inherit rpm
