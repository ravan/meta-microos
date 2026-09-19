SUMMARY = "Documentation for texlive-context-typescripts"
DESCRIPTION = "This package includes the documentation for texlive-context-typescripts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76524"

RPM_NAME = "texlive-context-typescripts-doc-2026.226.svn76524-61.2.noarch.rpm"
RPM_HASH = "2a2805de93d718a8dbead0ffa2e4a318387837dda3323b45e493802e459ee8968c5a7cfe645e6aca6fdd8d37f01a1a0a3f80e4321d04cf20cad011eeb4a0d175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
