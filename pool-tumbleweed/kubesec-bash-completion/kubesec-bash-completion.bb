SUMMARY = "Bash Completion for kubesec"
DESCRIPTION = "Bash command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.14.2"

RPM_NAME = "kubesec-bash-completion-2.14.2-1.11.noarch.rpm"
RPM_HASH = "28a6a10b82342e402a2775683bcb8b99860b1e49b0734c9d9d44c3d94c3734c1f3a988bad387ee076d496569fe0920c453d18b005d00a496c5d62c0a96ecd4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubesec"

inherit rpm
