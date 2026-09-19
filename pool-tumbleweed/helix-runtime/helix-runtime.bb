SUMMARY = "Runtime files for helix"
DESCRIPTION = "Helix runtime files. Separated due to how huge the runtime files are. \
The runtime contains tree-sitter and grammars that makes run helix normally \
if there is no runtime present in the users config directory specifically \
`XDG_CONFIG_HOME/helix`."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "25.07.1"

RPM_NAME = "helix-runtime-25.07.1-1.8.aarch64.rpm"
RPM_HASH = "5e183412f1059da08b22e599fa0ee3d7552a0832cbfb06ac4a8c4ba65e856f3d7e0f9e9bee033ac27f40fd74f616f96f52ab77ac813a4d2907e199fc3d038162"

RPROVIDES:${PN} += "helix-runtime \
ld.so"

RDEPENDS:${PN} += "helix \
libc.so.6 \
libstdc++.so.6"

inherit rpm
