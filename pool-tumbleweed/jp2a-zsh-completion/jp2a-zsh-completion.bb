SUMMARY = "Zsh completions scripts for jp2a"
DESCRIPTION = "This package contains the zsh completions scripts for jp2a."
LICENSE = "GPL-2.0-only"

PV = "1.3.3"

RPM_NAME = "jp2a-zsh-completion-1.3.3-1.6.noarch.rpm"
RPM_HASH = "f79c4fde807c70a1f7945a77880af92e192b14800a43ef4731b170078d287a0989f74917a6735489cbd740189a0843302d3e8c2b9ed84edda97f6fa884f62b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jp2a-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
