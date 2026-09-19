SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20240203.110809.5046fc22+git421"

RPM_NAME = "wezterm-zsh-completion-20240203.110809.5046fc22+git421-4.3.noarch.rpm"
RPM_HASH = "c44851c80ab991a17d849183d83f368655d5f74596247d3e2ed96e0ac6626090bc3234159d4447a6dd0bb6f9030e045f2e51535653ff4d636c866dcbb675c6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
