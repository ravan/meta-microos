SUMMARY = "Zsh completion for codex"
DESCRIPTION = "Zsh command line completion support for codex."
LICENSE = "Apache-2.0 & MIT & Unicode-3.0 & MPL-2.0 & ISC & BSD-3-Clause & Zlib & BSD-2-Clause & CC0-1.0 & CDLA-Permissive-2.0"

PV = "0.154.0"

RPM_NAME = "openai-codex-zsh-completion-0.154.0-1.1.noarch.rpm"
RPM_HASH = "c78dcbe2d0845e1f048098e885c421505ceec55015af1bf921a9d349e70f008a2e9cc1bb1ff134ccc3aac13cfcd610e7fd290866bb70bbd409698d030348b8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openai-codex-zsh-completion"

RDEPENDS:${PN} += "openai-codex"

inherit rpm
