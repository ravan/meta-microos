SUMMARY = "Bash tab-completion for virt-v2v"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.0"

RPM_NAME = "virt-v2v-bash-completion-2.12.0-1.1.noarch.rpm"
RPM_HASH = "3875151825a96a57385c801f36ce52d4fa004859c4ebcac72923b3084753d6cf2ed8852fc0f8895aef76557d2ee8a6172124051b7ca40d9cf425701e3fd15b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-bash-completion"

RDEPENDS:${PN} += "bash-completion \
virt-v2v"

inherit rpm
