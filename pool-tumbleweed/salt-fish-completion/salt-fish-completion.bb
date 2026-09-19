SUMMARY = "Fish Completion for salt"
DESCRIPTION = "Fish command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-fish-completion-3006.0-70.1.noarch.rpm"
RPM_HASH = "9b7d8232cedfbfab8816efc317de5082550b0200ad3fbb8bc379bd45f80f39fc7f43fae603dff4c3b9a32803974d524567c34f2ac25c018d8612244ed104b329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-fish-completion"

RDEPENDS:${PN} += "salt"

inherit rpm
