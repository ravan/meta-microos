SUMMARY = "Documentation for texlive-munich"
DESCRIPTION = "This package includes the documentation for texlive-munich"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-munich-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "ccfb6848ec2945413800d7e5c107c58d66ddbbacd79ffe4dea69e54503442fcbffd8d7e02e25d3f64808fdf3a58ba27c4bdc6a9d73b057ced54638b74d98af1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich-doc"

RDEPENDS:${PN} += ""

inherit rpm
