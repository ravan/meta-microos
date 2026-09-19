SUMMARY = "Bash completion for rage-encryption"
DESCRIPTION = "Bash command line completion support for rage-encryption"
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.11.1+0"

RPM_NAME = "rage-encryption-bash-completion-0.11.1+0-3.9.noarch.rpm"
RPM_HASH = "fa04a01dbc93068e08181dc6acb09d27c3523ea357afeb1a31962373e325be7eb40b9a2ff146ec39e2d15a4d2a356cec9111906024a7b20f5388bef70dd7e303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rage-encryption"

inherit rpm
