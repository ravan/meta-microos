SUMMARY = "Translations for package brltty"
DESCRIPTION = "Provides translations for the 'brltty' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-lang-6.9.1-2.1.noarch.rpm"
RPM_HASH = "7c78df67c08c080143a381f1563728c9de79e99dd3b0b6b133ea2f8afcc9566dd6c5612559547bd2398aaec682173f624d0e63e186ae345f26225e58549dd1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brltty-lang \
brltty-lang-all \
locale-brltty-ar \
locale-brltty-de \
locale-brltty-fr \
locale-brltty-it \
locale-brltty-ka \
locale-brltty-ru \
locale-brltty-sv \
locale-brltty-zh"

RDEPENDS:${PN} += "brltty"

inherit rpm
