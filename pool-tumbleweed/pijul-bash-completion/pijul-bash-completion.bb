SUMMARY = "Bash Completion for pijul"
DESCRIPTION = "Bash command-line completion support for pijul."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.9"

RPM_NAME = "pijul-bash-completion-1.0.0~beta.9-1.12.noarch.rpm"
RPM_HASH = "83a75563a90a8b07aa62dc66ca860fe7285d928a6060fd815c62c7476f8766dd53543d22f7d95c86454e313b9533d186fad03a6c605db0e4459166908dd627b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pijul-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pijul"

inherit rpm
