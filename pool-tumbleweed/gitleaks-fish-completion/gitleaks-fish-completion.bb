SUMMARY = "Fish Completion for gitleaks"
DESCRIPTION = "Fish command line completion support for gitleaks."
LICENSE = "MIT"

PV = "8.30.1"

RPM_NAME = "gitleaks-fish-completion-8.30.1-1.4.noarch.rpm"
RPM_HASH = "05742e1d1f0f65c9049be723f42729bb2a37bd8f7ebc24a09ead2598c7e1efe2360c8e0341a6a5d4ba2a378d5e7a9b2b00acfbe8d304c756b5d28943252faefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitleaks-fish-completion"

RDEPENDS:${PN} += "gitleaks"

inherit rpm
