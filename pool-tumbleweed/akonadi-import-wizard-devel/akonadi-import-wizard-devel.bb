SUMMARY = "Development files for the PIM data import assistant"
DESCRIPTION = "This package contains development headers to build new import plugins for \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-import-wizard-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0b4fc8a25d51271be2f5abc82f39871899c5546b41ebaa5943303486d8ccfb97665d7e62e1f4d39ff28e7bfaf77f2783a218e34821aa346822405d7628cb1afb"

RPROVIDES:${PN} += "akonadi-import-wizard-devel \
cmake-KPim6ImportWizard"

RDEPENDS:${PN} += "libKPim6ImportWizard6"

inherit rpm
