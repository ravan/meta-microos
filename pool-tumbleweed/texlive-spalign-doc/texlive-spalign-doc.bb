SUMMARY = "Documentation for texlive-spalign"
DESCRIPTION = "This package includes the documentation for texlive-spalign"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-spalign-doc-2026.226.svn77682-64.2.noarch.rpm"
RPM_HASH = "9f1d0bb2b0d1301bac8bd2e2a90c1375fcfbf7104ee47ce507ef77621fa84c18c642304ae1a730156743b6c324ed04700c94daeaaa08826795de896a078acca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
