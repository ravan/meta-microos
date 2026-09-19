SUMMARY = "Documentation for texlive-charter"
DESCRIPTION = "This package includes the documentation for texlive-charter"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-charter-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "65855c1a8f52bfe901f0735f1808259e6a1672e9c321f7012e54581b8dfe03817286976cf5aef9fb8a3999aa31a10484358d3ec93d05ba38974ef1f5898f8151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charter-doc"

RDEPENDS:${PN} += ""

inherit rpm
