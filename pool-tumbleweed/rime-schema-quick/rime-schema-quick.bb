SUMMARY = "Quick(er than canjie) input schema for rime"
DESCRIPTION = "quick input schema for rime, based on cangjie, but input quicker."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-quick-20250315-1.4.noarch.rpm"
RPM_HASH = "cbb9014e56fea8ba71d225bab18507d639fcee760eee1e335ffc69bc779501bedde17875eff74c450072ee223762069a77bec668bbc0c4dd4402617dc20f1ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-quick"

RDEPENDS:${PN} += ""

inherit rpm
