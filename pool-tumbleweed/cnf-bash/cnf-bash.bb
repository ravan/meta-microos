SUMMARY = "Integration of cnf with bash"
DESCRIPTION = "Bash setup code for command-not-found handler cnf."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "cnf-bash-0.9.1-1.1.noarch.rpm"
RPM_HASH = "dd05dde4dbd6233d64a39cf81184c4a0248ca06d37569071efe169d2f8ca4b99f94f23c3339115dcf72b118365577b65dc6e84ed0837fb307a91da4afce72cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cnf-bash \
cnf-rs-bash \
config-cnf-bash"

RDEPENDS:${PN} += "cnf"

inherit rpm
