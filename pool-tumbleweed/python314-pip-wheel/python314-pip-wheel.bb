SUMMARY = "The pip wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the pip wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python314-pip-wheel-26.2.1-1.1.noarch.rpm"
RPM_HASH = "24d07cf1eba0297a3a839b5a96226e5797760d345e8ca0d1ae96dc14b207037e3a2dd2055c5c1c8bc959c2bf117f671cd35662cbf43eba902cd441b96ce7a010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pip-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
