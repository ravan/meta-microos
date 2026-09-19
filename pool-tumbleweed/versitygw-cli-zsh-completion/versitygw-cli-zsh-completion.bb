SUMMARY = "Zsh Completion for versitygw"
DESCRIPTION = "zsh command line completion support for versitygw."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "versitygw-cli-zsh-completion-1.7.0-1.2.noarch.rpm"
RPM_HASH = "5ccd401de34795889d9ad8a5a897845206bcb60421fa5ecd2758ff37b8690afcda384d2bfd58d68292b2b8e31e0b74720c280ad6ebf5386ee8a564c48a2ae220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "versitygw-cli-zsh-completion \
versitygw-zsh-completion"

RDEPENDS:${PN} += "versitygw-cli \
zsh"

inherit rpm
