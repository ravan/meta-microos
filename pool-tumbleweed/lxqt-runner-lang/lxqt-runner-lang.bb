SUMMARY = "Translations for package lxqt-runner"
DESCRIPTION = "Provides translations for the 'lxqt-runner' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-runner-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "5fe38f1da5dd712954c3fc3fdf3502b2309dfd93cfb2adac86d8adefb6bca5700b101cd8d44e5fdeacaca5c59e6047dbb650e1a89e0bb668b228b3a5d56bad44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-runner-lang \
lxqt-runner-lang-all"

RDEPENDS:${PN} += "lxqt-runner"

inherit rpm
