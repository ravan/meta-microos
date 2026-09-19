SUMMARY = "Bash Completion for docker-stable"
DESCRIPTION = "Bash command line completion support for docker-stable."
LICENSE = "Apache-2.0"

PV = "24.0.9_ce"

RPM_NAME = "docker-stable-bash-completion-24.0.9_ce-19.3.noarch.rpm"
RPM_HASH = "a802803f0a51da6056808dd825674918f939f737482f7dccedbcd4cd0d5ec5c73b79ff43c15a1b183afcdf1de47bde5844220ab07dbf788fb3e18ff4d112597f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion \
docker-stable-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker-stable"

inherit rpm
