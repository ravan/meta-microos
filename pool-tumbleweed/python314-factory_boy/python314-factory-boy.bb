SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "python314-factory_boy-3.3.3-3.4.noarch.rpm"
RPM_HASH = "152ca424c3795b93b34242346d8dada47629239754186316840dbaa003a95ea4074f68fbcfe7acfe03e69727aac827fbb2801636ddee2cdef194a61417613609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-factory-boy \
python314-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python314-Faker"

inherit rpm
