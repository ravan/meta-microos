SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua55-markdown-0.331-6.3.noarch.rpm"
RPM_HASH = "d3739345f7495d25e55b2536b78056c04aec92573c9f6ce861e7a6f68e9a9e63546db54df02483a76c3387391b9994eda8208c9e534a93604479d9b7e87c4a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-markdown"

RDEPENDS:${PN} += "lua55"

inherit rpm
