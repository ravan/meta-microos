SUMMARY = "Use nvim as a pager"
DESCRIPTION = "Using neovim as a pager to view man pages, git diffs, whatnot with neovim's syntax highlighting and mouse support."
LICENSE = "BSD-2-Clause"

PV = "0.14.0"

RPM_NAME = "nvimpager-0.14.0-1.3.noarch.rpm"
RPM_HASH = "ddca5287701dac54f177ead061afd42043d942324f8d1d341c7208766757f394d85843ab0f84120aa8f20545fc545b6bb2f3baec8fdefa6ba9ce15943f67046f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager"

RDEPENDS:${PN} += "/usr/bin/bash \
lua54 \
neovim"

inherit rpm
