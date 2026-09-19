SUMMARY = "Fish Completion for helix"
DESCRIPTION = "Fish command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "25.07.1"

RPM_NAME = "helix-fish-completion-25.07.1-1.8.noarch.rpm"
RPM_HASH = "34810d12158be2fa1bc80f9ec9842e509fda95f7579d3904700ee528b47506b8272b7eab2c0fcc79393266533c63125b29b69a3c333e01d66efeea235ec28e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-fish-completion"

RDEPENDS:${PN} += "helix"

inherit rpm
