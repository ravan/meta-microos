SUMMARY = "Zsh Completion for git-cliff"
DESCRIPTION = "Zsh command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.14.1"

RPM_NAME = "git-cliff-zsh-completion-2.14.1-1.1.noarch.rpm"
RPM_HASH = "b5e1b0079c4af0f545bde61b7b7bcb5bec9b5b7fc0717d237f48339d2c57368fb0c362b9194923577c7657176e4ce1d6b13464afc25faf8e110a5199f0cf8f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
