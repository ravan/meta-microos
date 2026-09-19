SUMMARY = "Bash Completion for chainguard-dfc"
DESCRIPTION = "Bash command line completion support for chainguard-dfc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "chainguard-dfc-bash-completion-0.10.0-1.7.noarch.rpm"
RPM_HASH = "b67e67bb322ebb7706ea781f84876d9813d393b36f843ade436022d18a5abdd4bf5466f1a973154afcba9517115cd1aa6abb58427f220f5336870ee4d2b615cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chainguard-dfc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
chainguard-dfc"

inherit rpm
