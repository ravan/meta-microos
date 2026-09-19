SUMMARY = "Header files for developing C applications that use subunit"
DESCRIPTION = "Header files and libraries for developing C applications that use subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "subunit-devel-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "3adc95f8834ebd7034aa1785b3e5ddb979f34444626f8e332bc6e95b78c4ac68cbbc3adb37d27bf96aa4944708dee8182f557e071a53264afb539334a2a08231"

RPROVIDES:${PN} += "pkgconfig-libsubunit \
subunit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubunit0 \
subunit"

inherit rpm
