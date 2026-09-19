SUMMARY = "Fish completion for codex"
DESCRIPTION = "Fish command line completion support for codex."
LICENSE = "Apache-2.0 & MIT & Unicode-3.0 & MPL-2.0 & ISC & BSD-3-Clause & Zlib & BSD-2-Clause & CC0-1.0 & CDLA-Permissive-2.0"

PV = "0.154.0"

RPM_NAME = "openai-codex-fish-completion-0.154.0-1.1.noarch.rpm"
RPM_HASH = "f6c3aaa0a66aaae024ffb3b23947d38cc73d25d19c3a6c121a9606fcacdc10dfdbfa15dddcdf58081b8695cce903d1ffe47bdb1c9e232c01139198ce48d86330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openai-codex-fish-completion"

RDEPENDS:${PN} += "openai-codex"

inherit rpm
