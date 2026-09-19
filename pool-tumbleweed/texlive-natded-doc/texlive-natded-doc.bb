SUMMARY = "Documentation for texlive-natded"
DESCRIPTION = "This package includes the documentation for texlive-natded"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn32693"

RPM_NAME = "texlive-natded-doc-2026.226.0.0.1svn32693-61.2.noarch.rpm"
RPM_HASH = "7f0746805d82036d8929989c23a54ef6b5472310d4533ff85d754f9b059faed882296880e0be92704b346b817bc9728c9fafd7488eff32dc6b792cc1b50ce3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-natded-doc"

RDEPENDS:${PN} += ""

inherit rpm
