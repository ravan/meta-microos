SUMMARY = "Translations for package lxqt-policykit"
DESCRIPTION = "Provides translations for the 'lxqt-policykit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-policykit-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "bff169589afae728b2fc0fc4b65d6b164b26aeb8e53a95a270d48f2a8a61e74a6d23f741a8b9359b5a93c3de1c0de89ec1480d3b6c7a8c67ddaecd2bfedc64d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-policykit-lang \
lxqt-policykit-lang-all"

RDEPENDS:${PN} += "lxqt-policykit"

inherit rpm
