SUMMARY = "Fish completion for otpclient"
DESCRIPTION = "Fish command line completion support for otpclient."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-fish-completion-5.1.8-1.1.noarch.rpm"
RPM_HASH = "aebc5e5e87ac7fe3e4eae0f380157628ec54b9de270e5cb117f74990f61cb60fc06f3f54d7c285b5e3ee0f354a42818ce02db4b936f8e009690e65d3ff9996c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otpclient-fish-completion"

RDEPENDS:${PN} += "fish \
otpclient"

inherit rpm
