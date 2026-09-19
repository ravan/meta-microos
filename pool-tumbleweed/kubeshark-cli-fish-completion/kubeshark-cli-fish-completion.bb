SUMMARY = "Fish Completion for kubeshark-cli"
DESCRIPTION = "Fish command line completion support for kubeshark-cli."
LICENSE = "Apache-2.0"

PV = "53.4.0"

RPM_NAME = "kubeshark-cli-fish-completion-53.4.0-1.1.noarch.rpm"
RPM_HASH = "73bfab4edf4b5b5609640290f60d40ac144dd53cc46d0497596219802ee19e7f37856aad5d4f5090bae3e3f0a53f04ee6597b8e786ab0b9f9a3ab612a3fce7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeshark-cli-fish-completion"

RDEPENDS:${PN} += "kubeshark-cli"

inherit rpm
