SUMMARY = "Fish Completion for operator-sdk"
DESCRIPTION = "Fish command line completion support for operator-sdk."
LICENSE = "Apache-2.0"

PV = "1.42.3"

RPM_NAME = "operator-sdk-fish-completion-1.42.3-1.3.noarch.rpm"
RPM_HASH = "9b624bca765815d7afa49f3b81b96d1f79a4e0ed01c3b0a16fd9b6b258527e4e9c24813c6acfd77fe146e0de0e0c8877e24749935b5e6ac4017ff184e33d39b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "operator-sdk-fish-completion"

RDEPENDS:${PN} += "operator-sdk"

inherit rpm
