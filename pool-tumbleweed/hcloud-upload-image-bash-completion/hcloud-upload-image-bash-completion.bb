SUMMARY = "Bash Completion for hcloud-upload-image"
DESCRIPTION = "Bash command line completion support for hcloud-upload-image."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "hcloud-upload-image-bash-completion-1.5.0-1.3.noarch.rpm"
RPM_HASH = "6ff9b21e1315d4fcbb1aad3df82a1b76557f71f899c20967dc2554ee665034e7513248c3d1ab9f9c451e809313cb2e1eadc702ecd89c3f52cc57b49a12eba012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-upload-image-bash-completion"

RDEPENDS:${PN} += "bash-completion \
hcloud-upload-image"

inherit rpm
