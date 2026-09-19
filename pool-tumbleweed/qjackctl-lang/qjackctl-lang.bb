SUMMARY = "Translations for package qjackctl"
DESCRIPTION = "Provides translations for the 'qjackctl' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "qjackctl-lang-1.0.6-1.2.noarch.rpm"
RPM_HASH = "a7126004fb350a066a7150a547d74a461c33d2f86879e992938c813e74c62330b4c9aa349d0713eda203e862db15f9ec2a579bfa409d472995be577a18442dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qjackctl-lang \
qjackctl-lang-all"

RDEPENDS:${PN} += "qjackctl"

inherit rpm
