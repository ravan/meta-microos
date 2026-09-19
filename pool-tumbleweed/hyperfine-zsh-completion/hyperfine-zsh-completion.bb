SUMMARY = "ZSH Completion for hyperfine"
DESCRIPTION = "The official zsh completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.20.0"

RPM_NAME = "hyperfine-zsh-completion-1.20.0-2.4.noarch.rpm"
RPM_HASH = "e6cf64e5bdc7b277b3b29e9e6a54ec3b0487a07bf5ff6ed6d0b92e9f57733f5fdd197c73169cd0181033e67c4e7203d657133459d290eb6724a9e1aaebdd697f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-zsh-completion"

RDEPENDS:${PN} += "hyperfine"

inherit rpm
