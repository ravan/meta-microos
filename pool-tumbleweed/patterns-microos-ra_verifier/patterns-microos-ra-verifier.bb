SUMMARY = "Remote Attestation (Verifier) Support"
DESCRIPTION = "Packages required to enable remote attestation via Keylime verifier on \
openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_verifier-5.0-111.1.aarch64.rpm"
RPM_HASH = "857c34c474a05556ae2bd480aa49278a6fdd59adc5cf305b4a5ecf043bc5ad4c32eff2e94d5e5963601955d620f178563c35288a018517d18e41a0d867d18860"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ra-verifier"

RDEPENDS:${PN} += "keylime-firewalld \
keylime-registrar \
keylime-tenant \
keylime-verifier"

inherit rpm
