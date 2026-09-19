SUMMARY = "Bash completion for tpm2-tss-engine"
DESCRIPTION = "Optional dependency offering bash completion for the tpm2-tss-engine project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-bash-completion-1.2.0-3.9.noarch.rpm"
RPM_HASH = "038961bfc9ddf4788d2b33dec265fa16ca285bde3ae661c9cf1920680204f47da6084cbc9f41fdc39e152b80ba51d496480859c5c3da836af4ed814f573ef72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2-tss-engine-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tpm2-tss-engine"

inherit rpm
