SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.28.0"

RPM_NAME = "kubie-bash-completion-0.28.0-1.4.noarch.rpm"
RPM_HASH = "5a302ae0aa37aa8765c1cdd2ce5f6319356d54983c13494f0ad230a2bb5604d551db61cb73526d2ef7872572e9c3f072a9aafb7d0e5846346253b3a4002e8614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
