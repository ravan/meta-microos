SUMMARY = "Bash Completion for fastfetch"
DESCRIPTION = "Bash command-line completion support for fastfetch."
LICENSE = "MIT"

PV = "2.68.1"

RPM_NAME = "fastfetch-bash-completion-2.68.1-1.1.noarch.rpm"
RPM_HASH = "92afe7d913273ea1e6bcc52d8a12f0466c3ec3a3f1a2c4771c471f1fc55f1a364fafcb826c1505d4e264322e5c40d9f833802c7aef8dca4bc0579ab9c6894587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fastfetch-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fastfetch"

inherit rpm
