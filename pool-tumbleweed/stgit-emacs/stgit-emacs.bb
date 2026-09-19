SUMMARY = "emacs plugin for for stgit"
DESCRIPTION = "emacs command line completion support for stgit."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-emacs-2.6.1-3.3.noarch.rpm"
RPM_HASH = "abad5aa168e53230af42c549002a2b080957fbc56544e9e8ed2660a4a56d045d228b6ffebee2c48e0f9c8642bb5f6af1fc8066bd4badd1a66005e9559c1347aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stgit-emacs"

RDEPENDS:${PN} += "emacs \
stgit"

inherit rpm
