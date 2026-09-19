SUMMARY = "Zsh Completion for polaris"
DESCRIPTION = "zsh command line completion support for polaris."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "polaris-zsh-completion-10.2.2-1.1.noarch.rpm"
RPM_HASH = "3d5d8d2102954053714da0712ae410dc10b1c6a9017edcc1940c0797cc652e94eafb8ed32ab85d8e1f191d2fc3ebd248048fdb5c987a800f157672458bed8c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polaris-zsh-completion"

RDEPENDS:${PN} += "polaris"

inherit rpm
