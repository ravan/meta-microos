SUMMARY = "Bash Completion for zola"
DESCRIPTION = "Bash command-line completion support for zola."
LICENSE = "MIT"

PV = "0.23.3"

RPM_NAME = "zola-bash-completion-0.23.3-1.2.noarch.rpm"
RPM_HASH = "9095d078b4d5da9b5e00c65576d3194df25878b191b229b1498b7a6538410daf4296c2f92d8918eaad48bdf4b55196b6450a398b8a04d591bcf62ad31609f134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
