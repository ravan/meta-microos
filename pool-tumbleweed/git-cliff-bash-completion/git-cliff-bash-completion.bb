SUMMARY = "Bash Completion for git-cliff"
DESCRIPTION = "Bash command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.14.1"

RPM_NAME = "git-cliff-bash-completion-2.14.1-1.1.noarch.rpm"
RPM_HASH = "49ed87c9de9883c172d5284aea8db667b539eac5de17da5028ebf72d95cdc988257d244d6575b35d2a2674a423e86a967a4ff48246edf02fe7b6240a1398b5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
