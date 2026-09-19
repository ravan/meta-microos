SUMMARY = "Documentation for texlive-context-chat"
DESCRIPTION = "This package includes the documentation for texlive-context-chat"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72010"

RPM_NAME = "texlive-context-chat-doc-2026.226.svn72010-61.2.noarch.rpm"
RPM_HASH = "cb54d5d67d98ac6c7cbe7aa71113ad047739c70a6b609a6e6ef0d4bf91f6fad95e825fa57adc1fcf1d5eba7c6964644362cd1e9accc72aa387ce5cd12d41cc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-chat-doc"

RDEPENDS:${PN} += ""

inherit rpm
