SUMMARY = "Documentation for texlive-luaindex"
DESCRIPTION = "This package includes the documentation for texlive-luaindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-doc-2026.226.0.0.1bsvn25882-59.2.noarch.rpm"
RPM_HASH = "b160136c47c7a53dad282b1a22f342977b92831c8094968e8f97d9aac46c5a93e2a6a7e33880f567240501ff5d3eec598333ed41b97a1f2a16859f3ebbbb6426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
