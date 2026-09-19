SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.58.0"

RPM_NAME = "just-bash-completion-1.58.0-1.2.noarch.rpm"
RPM_HASH = "d6dc4992eef580422d2ff941bb055dff68ccaa097636a3580b9615eeadb7530abee76ca7e31436fd81eb4eeffe85f56e685d13f667ac709e71a8ea0dcb0b65dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
