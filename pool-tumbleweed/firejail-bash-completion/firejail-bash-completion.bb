SUMMARY = "Firejail Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for firejail"
LICENSE = "GPL-2.0-only"

PV = "0.9.80"

RPM_NAME = "firejail-bash-completion-0.9.80-1.4.noarch.rpm"
RPM_HASH = "9c57cf44c815b2234b4f9a2cc86547f4e2ed93417a593af74cd4f5636661cc21d1eedb4f31707f57ea78c92a93d303b4a6b13bec5a50c5d950cc25208141109f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firejail-bash-completion"

RDEPENDS:${PN} += "bash-completion \
firejail"

inherit rpm
