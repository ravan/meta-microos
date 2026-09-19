SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20240203.110809.5046fc22+git421"

RPM_NAME = "wezterm-fish-completion-20240203.110809.5046fc22+git421-4.3.noarch.rpm"
RPM_HASH = "dc9f0405d514b38a8ced4518c12616d9a743f4f252c0c5b473afefd2384d9be8854c5b77e6722d1b54764f821f4992b6c321fd16963fc6a32318549657169004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
