SUMMARY = "Bash Completion for zellij"
DESCRIPTION = "Bash command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.44.3"

RPM_NAME = "zellij-bash-completion-0.44.3-1.4.noarch.rpm"
RPM_HASH = "0026854bf7efeef6daa17e5b7c552bf47451b7eead2643baedd6853172b13a57348965bceb9fb099458adcebcaf48a3259205b3e49b482c7680904439a81959e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
