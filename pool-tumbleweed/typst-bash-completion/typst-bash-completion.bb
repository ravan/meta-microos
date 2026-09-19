SUMMARY = "Bash Completion for typst"
DESCRIPTION = "Bash command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "typst-bash-completion-0.15.1-1.1.noarch.rpm"
RPM_HASH = "3f38fce509391992b8a4439f4b9395592375b710b1e01706222973e467815dde653727c9c8031f7d68784b9722193abf2e8a098d64541a1b813115493d792c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-bash-completion"

RDEPENDS:${PN} += "typst"

inherit rpm
