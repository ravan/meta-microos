SUMMARY = "Translations for package subnetcalc"
DESCRIPTION = "Provides translations for the 'subnetcalc' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.6"

RPM_NAME = "subnetcalc-lang-2.6.6-1.3.noarch.rpm"
RPM_HASH = "3bbf4a24682f5af3584ff94bddcd925b3069490e07b3604eea600b9421f30523196cb594d7e36fd0e1810a9b42e72eb5548a79d74b355d29d61816380134228c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subnetcalc-de \
locale-subnetcalc-ka \
locale-subnetcalc-nb \
subnetcalc-lang \
subnetcalc-lang-all"

RDEPENDS:${PN} += "subnetcalc"

inherit rpm
