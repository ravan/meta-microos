SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.22.2"

RPM_NAME = "python313-fastjsonschema-2.22.2-1.1.noarch.rpm"
RPM_HASH = "b54bf76b453d7859bc320a5a01d7174a2f1afb1d3d0179f80bb0bdaabf21e113c5be62e90bc830f7e5d0aaa3cc3f0eba51efc9c7786539687ec33864ac40f173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastjsonschema \
python3.13dist-fastjsonschema \
python313-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
