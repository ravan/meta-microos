SUMMARY = "Zsh Completion for openQA"
DESCRIPTION = "The official zsh completion script for openqa-cli."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-client-zsh-completion-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "8987e9ad726e84916cd7dd0b8961d8c387e15193ae7ab0d032f94a4d998e4cb404020a1e09685897d6141c99b8363da100ae7763df6742b6cdd33ca142fdec6b"

RPROVIDES:${PN} += "openQA-client-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
