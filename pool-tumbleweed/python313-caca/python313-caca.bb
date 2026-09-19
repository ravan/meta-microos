SUMMARY = "Python3 support for libcaca"
DESCRIPTION = "This package contains all that is needed to use libcaca from python3."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "python313-caca-0.99.beta20+git.1776622070.7c8e333-2.3.noarch.rpm"
RPM_HASH = "0b3e0f22e2b83a506bad054bb6145e40795ca08db8df90c31799eb473871d3f115cdfb086e5efdf80adc5c10e05d90dc2c583ffcba21050310dc7c52045f3795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caca \
python3.13dist-caca \
python313-caca \
python3dist-caca"

RDEPENDS:${PN} += "libcaca \
python-abi"

inherit rpm
