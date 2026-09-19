SUMMARY = "Zsh Completion for helix"
DESCRIPTION = "Zsh command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "25.07.1"

RPM_NAME = "helix-zsh-completion-25.07.1-1.8.noarch.rpm"
RPM_HASH = "4f97ad67b93462c03450b1ef8e67340f4ed53e6b0e94508a5cc20a6a9b8023a2fb61544180ab034dd43eedff1010a7b6eec6aca121f31492616599060fd23d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-zsh-completion"

RDEPENDS:${PN} += "helix"

inherit rpm
