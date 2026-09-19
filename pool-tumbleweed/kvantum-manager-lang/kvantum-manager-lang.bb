SUMMARY = "Translations for Kvantum manager"
DESCRIPTION = " \
This package provides translations for Kvantum manager."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-manager-lang-1.1.8-1.2.noarch.rpm"
RPM_HASH = "120d632f236f8acb20de66cf9eb292e45fbba8b43bee07ed7c4ff7747ed089637f44e52e66864e4ec556bffffa97d62b31409e957a73f39668e909b86f0577e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-manager-lang"

RDEPENDS:${PN} += "kvantum-manager"

inherit rpm
