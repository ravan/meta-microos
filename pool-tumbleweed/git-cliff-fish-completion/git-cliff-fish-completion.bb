SUMMARY = "Fish Completion for git-cliff"
DESCRIPTION = "Fish command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.14.1"

RPM_NAME = "git-cliff-fish-completion-2.14.1-1.1.noarch.rpm"
RPM_HASH = "1a6e1e9dec2646a61eb23f97007630f8d10e1eb298e3729ab54410926b9a06d990b68f4ec5731ea3b469043d16de2032784788e16f07784f289e883441d2d5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
