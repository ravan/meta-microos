SUMMARY = "Zsh tab-completion for gpaste"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
This package provides zsh tab-completion for gpaste."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "gpaste-zsh-completion-50.9-1.1.noarch.rpm"
RPM_HASH = "d5b18c74398344dacca07d2cef377fe0ca141a7aeb7a8f8158627f23014cc0be3a69a2ad17a984c5e36e22f82c66f83bd7cba29746f051716cddbc5b0fe37713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
