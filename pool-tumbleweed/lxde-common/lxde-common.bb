SUMMARY = "This package provides a set of default configurations for LXDE"
DESCRIPTION = "Lxde-common package provides a set of default configurations for LXDE. \
It's an LXDE core package, since without it LXDE cannot run."
LICENSE = "GPL-2.0"

PV = "0.99.2"

RPM_NAME = "lxde-common-0.99.2-2.27.noarch.rpm"
RPM_HASH = "048a4b25e488dfa1ec8f6ef3c51e594332231825eb24a8e92cacb1b2749ee426c4db38bac3b93bc9aee9f1096cac058db7680b62c18d03732aa7b345200ed11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxde-common \
lxde-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
lxde-common-branding \
update-alternatives"

inherit rpm
