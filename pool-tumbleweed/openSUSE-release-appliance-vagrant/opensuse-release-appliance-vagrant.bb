SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-vagrant-20260915-3446.1.aarch64.rpm"
RPM_HASH = "a6741aefa0d2fe2058ea18ee6e60ee9e1eed0b33c775eec931410f9e8873a92793cff492545a60163153446c00b27f6d83e5fe2db2289e55ca5b7b61f498e6c3"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
