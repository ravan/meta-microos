SUMMARY = "Tool to analyze git deps - HTML parts"
DESCRIPTION = "Documentation for git-deps."
LICENSE = "GPL-2.0-only"

PV = "1.1.0+git.1696898573.89d51e8"

RPM_NAME = "git-deps-html-1.1.0+git.1696898573.89d51e8-4.2.noarch.rpm"
RPM_HASH = "3f12f0fd085748f3b586bbe668ec9c99b9b66d49e665c504239d9996545fa7b1b0fc68374bb2089f2acb410e9d1b7abcd359f6fd0bf0b19b97fce9a3e4d5694d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps-html"

RDEPENDS:${PN} += ""

inherit rpm
