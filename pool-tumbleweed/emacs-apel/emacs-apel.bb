SUMMARY = "A Portable Emacs Library"
DESCRIPTION = "A Portable Emacs Library"
LICENSE = "GPL-2.0-or-later"

PV = "10.8+81+g82eb232"

RPM_NAME = "emacs-apel-10.8+81+g82eb232-1.9.noarch.rpm"
RPM_HASH = "a485695d6ea422b61716ad8589de7b1beea1fe2549981416ab6a5122e7552860e1278df97b49108052e467771f49d993f9ae47e5b352cd8916f27d09dab40f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apel \
emacs-apel"

RDEPENDS:${PN} += "emacs \
emacs-program"

inherit rpm
