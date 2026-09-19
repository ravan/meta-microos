SUMMARY = "Bash Completion for helix"
DESCRIPTION = "Bash command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "25.07.1"

RPM_NAME = "helix-bash-completion-25.07.1-1.8.noarch.rpm"
RPM_HASH = "aecb13943a6d3fa2aaf4f0548da3fff347a7545130a7a9fe9e02900b5f2b7dfcd06d4bde34fc5bc07946cfe01e569c32b5eb352ae91b3fc8727fff1dff78ed5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-bash-completion"

RDEPENDS:${PN} += "helix"

inherit rpm
