SUMMARY = "Zsh Completion for rage-encryption"
DESCRIPTION = "Zsh command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.11.1+0"

RPM_NAME = "rage-encryption-zsh-completion-0.11.1+0-3.9.noarch.rpm"
RPM_HASH = "a4a06a28b05a853b9557f12349d047ee824be6cfe28dba89742fb5180815687a5dd7c9cc3450e53d722a01a0a876569d3902a3ca484a5946c346024ed54c5ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
