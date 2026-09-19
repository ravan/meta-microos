SUMMARY = "Documentation for texlive-musicography"
DESCRIPTION = "This package includes the documentation for texlive-musicography"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-musicography-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "4e283b4e934493514250cc8fa5302ebec29d3610d6bec58fee9886ddf00fce52d8d2922c11c55b6853f8acb76d1b476b2f9069eddefcdeb4f1ead647cc62f34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musicography-doc"

RDEPENDS:${PN} += ""

inherit rpm
