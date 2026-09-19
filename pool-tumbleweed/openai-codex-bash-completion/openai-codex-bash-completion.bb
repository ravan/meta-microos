SUMMARY = "Bash completion for codex"
DESCRIPTION = "Bash command line completion support for codex."
LICENSE = "Apache-2.0 & MIT & Unicode-3.0 & MPL-2.0 & ISC & BSD-3-Clause & Zlib & BSD-2-Clause & CC0-1.0 & CDLA-Permissive-2.0"

PV = "0.154.0"

RPM_NAME = "openai-codex-bash-completion-0.154.0-1.1.noarch.rpm"
RPM_HASH = "ca6bcbf5a62594cefd54bd37b22b68b5b41b72ea7169275a444842f5390ff88bf777b07f46f57ac4d36bcbc37ffe95317aad15d925a652b8476649216b7abb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openai-codex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
openai-codex"

inherit rpm
