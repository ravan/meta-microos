SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-tests-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "5329d2d96b63f7c9c47e19fd27c324e773ed2fd5d1b541d08783c484e9861b1a1133c564ee3f07f569987459148488ecb038ede1b2d2b5429f8ac2f5b11ecffd"

RPROVIDES:${PN} += "kubevirt-1.8-tests \
kubevirt-tests \
kubevirt1.8-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
