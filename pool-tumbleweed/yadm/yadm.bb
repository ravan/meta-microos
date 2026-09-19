SUMMARY = "Yet Another Dotfiles Manager"
DESCRIPTION = "yadm is a tool for managing a collection of files across multiple computers, \
using a shared Git repository. In addition, yadm provides a feature to select \
alternate versions of files based on the operation system or host name. Lastly, \
yadm supplies the ability to manage a subset of secure files, which are \
encrypted before they are included in the repository."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "yadm-3.3.0-1.6.noarch.rpm"
RPM_HASH = "cd2766f586d428a64faea74e8da6022ab2576e6ea83b50a63cd5472ceb30deb4161f626ec1a325828061699bb2ce1aaac5ba40bd8695b1045c4e9548636f08cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
git-core"

inherit rpm
