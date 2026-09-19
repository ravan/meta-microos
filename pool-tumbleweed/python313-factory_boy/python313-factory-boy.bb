SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "python313-factory_boy-3.3.3-3.4.noarch.rpm"
RPM_HASH = "623be1467036c04c132378f8ecb30ad58fbb8005b3c0fe974fbef4222ed057c70f7996062e54475d9eacb15e0940313baa9c8ee845091d1e881fc7587154df31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-factory-boy \
python3.13dist-factory-boy \
python313-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python313-Faker"

inherit rpm
