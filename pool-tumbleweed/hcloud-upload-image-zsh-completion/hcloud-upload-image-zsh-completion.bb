SUMMARY = "Zsh Completion for hcloud-upload-image"
DESCRIPTION = "zsh command line completion support for hcloud-upload-image."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "hcloud-upload-image-zsh-completion-1.5.0-1.3.noarch.rpm"
RPM_HASH = "41d4ac6e41cc19a0e3ef8fbe09ad1d19fd842d80d95eea22684e0c76de107ea4f860d8582bf5bf4fd248e315043eec4fe7512ddef1723fb9be161c43424c50cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-upload-image-zsh-completion"

RDEPENDS:${PN} += "hcloud-upload-image"

inherit rpm
