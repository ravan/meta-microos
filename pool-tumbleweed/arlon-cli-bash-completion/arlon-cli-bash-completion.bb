SUMMARY = "Bash Completion for arlon-cli"
DESCRIPTION = "Bash command line completion support for arlon-cli."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "arlon-cli-bash-completion-0.10.0-1.13.noarch.rpm"
RPM_HASH = "c92ca5bcc307139aa83aa1bda040a95a2c2bcf374f3a5f69262f04ca5a59377f35094001853dda4dacdd49eb6dbbeb7ab1f3a535937dfb9ddac8653c892fc313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arlon-cli-bash-completion"

RDEPENDS:${PN} += "arlon-cli \
bash-completion"

inherit rpm
