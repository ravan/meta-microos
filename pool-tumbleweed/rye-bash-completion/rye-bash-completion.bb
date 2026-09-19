SUMMARY = "Bash Completion for rye"
DESCRIPTION = "Bash command-line completion support for rye."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "rye-bash-completion-0.44.0-1.8.noarch.rpm"
RPM_HASH = "f6a3e7df76f4d5a2f8d017f13d519f872bcd20a621ac97c4d9191f4fe551f245b1cb4ddc68e5b76d4122127730fdfe33515eec610c556d9c637be89e61c1076a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rye-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rye"

inherit rpm
