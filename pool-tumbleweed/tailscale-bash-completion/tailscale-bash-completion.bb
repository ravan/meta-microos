SUMMARY = "Tailscale bash completion"
DESCRIPTION = "bash completions for tailscale"
LICENSE = "BSD-3-Clause"

PV = "1.102.3"

RPM_NAME = "tailscale-bash-completion-1.102.3-1.1.noarch.rpm"
RPM_HASH = "06de6caf062d209cd5253a1dbd7a15ddad228e715c46ac48d4d8a7f41efd9df74e2ecc5d96dd9e6f3b2079a0db3a273393e0fcb68f3ded5f964bf70e0b94fb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tailscale-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
