SUMMARY = "Tailscale fish completion"
DESCRIPTION = "fish completion for tailscale"
LICENSE = "BSD-3-Clause"

PV = "1.102.3"

RPM_NAME = "tailscale-fish-completion-1.102.3-1.1.noarch.rpm"
RPM_HASH = "5dd3f0e524c8911e7b814ccd6254e7ce19a723c217894b7641f886a9d54e05609a2fe59991e89960c47a92b22be067658c4a2682fded28e8d8254085921fef6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tailscale-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
