SUMMARY = "Remote Attestation (Agent) Support"
DESCRIPTION = "Packages required to enable remote attestation via the Rust Keylime \
agent on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_agent-5.0-111.1.aarch64.rpm"
RPM_HASH = "a30c7f448b6132321577e0c145715f6ef9dd2ba677daef70b8b7a3be5b2ee7bd52bd7b82d39fc832e5fbbac602feec8454ed9fd285c3e62f41b2bf550f269023"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ra-agent"

RDEPENDS:${PN} += "dmidecode \
pattern- \
rust-keylime"

inherit rpm
