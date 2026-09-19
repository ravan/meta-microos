SUMMARY = "Documentation for texlive-layaureo"
DESCRIPTION = "This package includes the documentation for texlive-layaureo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-doc-2026.226.0.0.2svn19087-61.2.noarch.rpm"
RPM_HASH = "8329bb848809b51c013fede25218c0e5cdddfdb16e962bb14f9fb92be0b2984f38862ce54bd061e874b247c52efce2988ac2460d77f8087b6ad23ad66371061c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-layaureo-doc-it \
texlive-layaureo-doc"

RDEPENDS:${PN} += ""

inherit rpm
