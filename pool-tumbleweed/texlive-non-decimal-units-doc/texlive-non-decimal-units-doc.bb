SUMMARY = "Documentation for texlive-non-decimal-units"
DESCRIPTION = "This package includes the documentation for texlive-non-decimal-units"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-non-decimal-units-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "bf798ed16311f3d91f3c8240bf1f6d583b4f2b3d411093ea0573752122121cc3822f3371a33f149eb02756f3e3809ea3105898245fff29f3e9ef7ae96252f395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-non-decimal-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
