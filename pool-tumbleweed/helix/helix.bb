SUMMARY = "A post-modern modal text editor written in Rust"
DESCRIPTION = "A kakoune/neovim inspired modal text editor with built-in LSP and \
has treesitter support for syntax highlighting and improved navigation"
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "25.07.1"

RPM_NAME = "helix-25.07.1-1.8.aarch64.rpm"
RPM_HASH = "2181f1f024ccec32a972a05ae345a23f20607dde4d627aad36a2d1b1dfbff5f5b098cd1b7e659773c5f8bd773e474c91a952bfdcc94e8da3317b3e9ee65b1b29"

RPROVIDES:${PN} += "helix"

RDEPENDS:${PN} += "helix-runtime \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
