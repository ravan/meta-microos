SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.58.0"

RPM_NAME = "just-zsh-completion-1.58.0-1.2.noarch.rpm"
RPM_HASH = "920ca2293b2e4688cd8571aeb36cf0f2b19d8e6217369d97ccf8bd006b1e18b159709fdcfc59ca5b3f00851708bb7e83355e929a92df82a126cf43a869a59477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
