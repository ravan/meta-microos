SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "luajit-markdown-0.331-6.3.noarch.rpm"
RPM_HASH = "aa844c2b6710a343766338e4e33730fadc8a381bb372a1c443336bf26f5cefa793aabcccd5ac141f2ba99e1dbb79fd9db7185217125df002f9beb4c3133d5229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-markdown"

RDEPENDS:${PN} += "luajit"

inherit rpm
