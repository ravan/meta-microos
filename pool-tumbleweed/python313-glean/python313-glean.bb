SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.25.1"

RPM_NAME = "python313-glean-1.25.1-1.3.noarch.rpm"
RPM_HASH = "9b5bc1f54f3c80c1a74e2c696efe2d703c7e1e842b013361d51a32e3787be9eb7a1171772bcf348fee2da5a9791df25bd964cdeb7b4963036f316f85155ed11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean \
python3.13dist-glean \
python313-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
