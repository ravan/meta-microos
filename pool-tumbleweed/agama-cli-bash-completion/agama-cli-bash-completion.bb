SUMMARY = "Bash Completion for agama-cli"
DESCRIPTION = "Bash command-line completion support for agama."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-cli-bash-completion-24+0.a836cced5-54.1.noarch.rpm"
RPM_HASH = "829789f5c611b7d5f0a7a81abf3c2d30f206c90f79b2c29645f85cfe44da95ff68101e43d752411524c303455c2d0fe6d07be7732eebc4f3ba6a99a79fdf85aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-cli-bash-completion"

RDEPENDS:${PN} += "agama-cli \
bash-completion"

inherit rpm
