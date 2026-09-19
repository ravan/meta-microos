SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.28.0"

RPM_NAME = "kubie-fish-completion-0.28.0-1.4.noarch.rpm"
RPM_HASH = "561ffde52593b83c593fbc62838e67559347af534752de9d21985e72dc6252863ddddf1b5fc19b0f8d93d56c519ce7ebe94a65036f450f9188665537da330db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
