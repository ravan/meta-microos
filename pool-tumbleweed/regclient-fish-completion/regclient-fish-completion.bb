SUMMARY = "Fish Completion for regclient"
DESCRIPTION = "Fish command line completion support for regclient."
LICENSE = "Apache-2.0"

PV = "0.11.5"

RPM_NAME = "regclient-fish-completion-0.11.5-1.4.noarch.rpm"
RPM_HASH = "cb66adc2000b50e9ac6b53c8d32e7a1afe35ad86e9b7daba9efd9c50bae4b0036d4f4cf4b15886adc54a63a6735a4ff42b7737631f103490ef8854f3911b0e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regclient-fish-completion"

RDEPENDS:${PN} += "regclient"

inherit rpm
