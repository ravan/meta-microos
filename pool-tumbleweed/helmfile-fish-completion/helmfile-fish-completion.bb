SUMMARY = "Fish Completion for helmfile"
DESCRIPTION = "Fish command line completion support for helmfile."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "helmfile-fish-completion-1.8.0-1.1.noarch.rpm"
RPM_HASH = "1edd205324a82e64e0df614629bbf187531200efab299c863c0aaed8b60cdc90e7843a8ce5b4d26f9a0d665ade17f9797742689c53f1f06b98300762194066ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helmfile-fish-completion"

RDEPENDS:${PN} += "helmfile"

inherit rpm
