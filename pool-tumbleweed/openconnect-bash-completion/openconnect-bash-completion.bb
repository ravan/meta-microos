SUMMARY = "Bash Completion for openconnect"
DESCRIPTION = "Bash completion script for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "openconnect-bash-completion-9.21-1.3.noarch.rpm"
RPM_HASH = "e5fab4a96b5f7a75fde4f97c05906941affb2d17b2139b4d856b9396bac3f2a806e36b4e23d89a15a07ca60c18fbd1e5ca04cf79b67ee280be459193a83e5735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-bash-completion"

RDEPENDS:${PN} += "bash-completion \
openconnect"

inherit rpm
