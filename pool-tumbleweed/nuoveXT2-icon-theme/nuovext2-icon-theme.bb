SUMMARY = "This package provides the default LXDE icon theme"
DESCRIPTION = "This package provides the default LXDE icon theme. \
nuoveXT2-icon-theme is no more maintained from his author so \
LXDE project decided to maintain it and keep working on it"
LICENSE = "GPL-3.0"

PV = "0.5.1"

RPM_NAME = "nuoveXT2-icon-theme-0.5.1-1.25.noarch.rpm"
RPM_HASH = "596c9520245d02ab69e948c80bd31ff90819c697608ab5c631fcd31d66896db946807f99a3c4d9602af34a5e7e7f22b933d96e8c7e5af2edc6d949dffd486b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuoveXT2-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
