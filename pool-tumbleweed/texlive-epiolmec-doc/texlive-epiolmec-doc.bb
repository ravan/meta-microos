SUMMARY = "Documentation for texlive-epiolmec"
DESCRIPTION = "This package includes the documentation for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-epiolmec-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "91c09b31e1cf23391862f083e3ec2757f8943e64ff56aafa1154e2b6d48d04a77b5633441482a27b4ebeaa675c3c81643dc8f29a05681d33565de1c550385852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epiolmec-doc"

RDEPENDS:${PN} += ""

inherit rpm
