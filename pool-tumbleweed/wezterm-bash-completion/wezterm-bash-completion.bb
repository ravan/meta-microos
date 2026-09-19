SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20240203.110809.5046fc22+git421"

RPM_NAME = "wezterm-bash-completion-20240203.110809.5046fc22+git421-4.3.noarch.rpm"
RPM_HASH = "ed40a2aca50bfc0cc06802851183b130f6c5efbff95bf18c7048a243a9e2e07eaf50c816ed92b0a4064880a3dda4f9295ff66eaca330accc5b99f11bc84c5c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
