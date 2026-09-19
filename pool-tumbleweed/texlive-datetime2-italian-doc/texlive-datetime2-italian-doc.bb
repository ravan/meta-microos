SUMMARY = "Documentation for texlive-datetime2-italian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-italian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-doc-2026.226.1.3svn37146-59.2.noarch.rpm"
RPM_HASH = "8b23191dab937b428fdc429ae13a0ae9146a48e601ef817effdedcd23f7c5601fa190ea812585f22504671f5588a265c4680b0dc6254032639ab0d62992e4bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
