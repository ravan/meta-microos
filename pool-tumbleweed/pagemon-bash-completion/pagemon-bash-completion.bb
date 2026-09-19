SUMMARY = "Bash Completion for pagemon"
DESCRIPTION = "Bash completion script for pagemon."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "pagemon-bash-completion-0.02.06-1.4.noarch.rpm"
RPM_HASH = "0858e2b8f4ae6f6c229f0f6ce54c3422d77e6c053c88308ec45698891d50c5dbb8d86163fd36e2f520152f4acaa25be0d50227916869a4adceb22d8a4b20b31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagemon-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pagemon"

inherit rpm
