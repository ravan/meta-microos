SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.22.2"

RPM_NAME = "python314-fastjsonschema-2.22.2-1.1.noarch.rpm"
RPM_HASH = "5e4a1be08235fed69cda8cf2c178f16e3a4c8754c3fe72c6284df89c58ffbe259dfe10f7884e59c1946738d557fd473129bbafcc15d9acceace680a8801297a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastjsonschema \
python314-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
