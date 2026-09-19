SUMMARY = "Bash Completion for yq"
DESCRIPTION = "Bash command line completion support for yq."
LICENSE = "MIT"

PV = "4.53.3"

RPM_NAME = "yq-bash-completion-4.53.3-2.1.noarch.rpm"
RPM_HASH = "35d3ea6d232826f6951853127a41196914bbc0ea2d6e63b7def8d0ee0ebd9daabbbb14ad7a7dadb9f2cb68ca80b983107d0855334d8b5745a1250e51cad986b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-bash-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
