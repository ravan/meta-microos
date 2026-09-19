SUMMARY = "Documentation for texlive-tex-ewd"
DESCRIPTION = "This package includes the documentation for texlive-tex-ewd"
LICENSE = "BSD-3-Clause"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-tex-ewd-doc-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "6d10047bbbe29a8c3f96d0505a925abf1610212e1de968abca1a5f60843a1f0470708f70889f3c272460221546de68c535690a94e88f817cfe0ad612dc330c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ewd-doc"

RDEPENDS:${PN} += ""

inherit rpm
