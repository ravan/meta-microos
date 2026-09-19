SUMMARY = "Avocado plugin to generate variants out of yaml files"
DESCRIPTION = "This plugin can be used to produce multiple test variants with test parameters \
defined in one or more YAML files."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-varianter-yaml-to-mux-113.0-1.2.noarch.rpm"
RPM_HASH = "6d9e9ea73f55603fc201807416db212257cf2f389e3956b320851bef1a5326a5539a21dd24772af45b527b587ded2b5752f9ed84ff70346eb0748afb1d208676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-yaml-to-mux \
python3.13dist-avocado-framework-plugin-varianter-yaml-to-mux \
python3dist-avocado-framework-plugin-varianter-yaml-to-mux"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-pyaml"

inherit rpm
