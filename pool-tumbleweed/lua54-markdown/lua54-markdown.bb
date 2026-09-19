SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua54-markdown-0.331-6.3.noarch.rpm"
RPM_HASH = "0294e1d9a65633ea7563f18bf15cc9d67c17016b56d4934e5b1e1e5d7b9040d8efcf5f276104569afaa0229cdb547134721aed80fb3fec39edf96c1cbd80261f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-markdown \
lua54-markdown"

RDEPENDS:${PN} += "lua54"

inherit rpm
