SUMMARY = "Set of tests for official Augeas lenses"
DESCRIPTION = "Set of tests for official Augeas lenses. These can be used when \
modifying the official lenses, or when creating new ones."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-lense-tests-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "96692c94fe71cd93798027caa1c1107038954572492897e9529828d1e7101ba90ff42c67cfb59455601cdf25f43aee12f42fd8f97d2478a0bc97d90a7b20e192"

RPROVIDES:${PN} += "augeas-lense-tests"

RDEPENDS:${PN} += "augeas-lenses"

inherit rpm
