SUMMARY = "The setuptools wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the setuptools wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python311-setuptools-wheel-80.9.0-3.3.noarch.rpm"
RPM_HASH = "0ad44433d4105e795fadae8e6a852d0e89244434f0d7620a2d11d6f70a01ef8539cf9ae53710e7d1e958162dde0db17e6da22a2e22431249966042e36cbc1218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-setuptools-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
