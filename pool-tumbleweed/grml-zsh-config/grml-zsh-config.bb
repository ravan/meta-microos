SUMMARY = "Zsh config ujed by grml"
DESCRIPTION = "Zsh configuration files used by grml."
LICENSE = "GPL-2.0-only"

PV = "0.20.2"

RPM_NAME = "grml-zsh-config-0.20.2-1.1.noarch.rpm"
RPM_HASH = "b8d3c8d595cf6ce22949adff9a7a30d77fd9936f1608c3a8fb13d3dbdacdcd9471081f222f7d62daafca6a6e65ae372f1aed49d5fc4236e5dce1a03814193038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grml-zsh-config \
grml-zsh-config"

RDEPENDS:${PN} += "grep \
procps \
sed \
zsh"

inherit rpm
