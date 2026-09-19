SUMMARY = "Fish Completion for arlon-cli"
DESCRIPTION = "Fish command line completion support for arlon-cli."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "arlon-cli-fish-completion-0.10.0-1.13.noarch.rpm"
RPM_HASH = "ba22956988924ba513ca302b4a955bfbe7d5de17902206e805bb69a16e59b632987c2c6dcbf6048367d87ba89b4a16019d86c5329c08084f79ce2f7ddd25e2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arlon-cli-fish-completion"

RDEPENDS:${PN} += "arlon-cli"

inherit rpm
