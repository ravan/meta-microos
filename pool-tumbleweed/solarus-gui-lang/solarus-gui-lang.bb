SUMMARY = "Translations for package solarus-gui"
DESCRIPTION = "Provides translations for the 'solarus-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-lang-1.6.5-3.3.noarch.rpm"
RPM_HASH = "8555d97e650953b405f7769aa403fab510469a1cbc0db707708959b7446cf080e0659f9267772a51e5cbf21ec4e4c5b159dd83b081b03b9d67b601ee35ef2e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solarus-gui-lang \
solarus-gui-lang-all"

RDEPENDS:${PN} += "solarus-gui"

inherit rpm
