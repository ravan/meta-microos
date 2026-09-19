SUMMARY = "Documentation for texlive-xecolor"
DESCRIPTION = "This package includes the documentation for texlive-xecolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-xecolor-doc-2026.226.0.0.1svn77682-59.4.noarch.rpm"
RPM_HASH = "1db10ce15dce7b65d1bd31dc0e2bb6ed3f9f7caf14bbe3fdd292ed2378a6fe3686908f9033f1a82a7796383de745925067c3ac80a2ef301ac30cecd350e5c593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
