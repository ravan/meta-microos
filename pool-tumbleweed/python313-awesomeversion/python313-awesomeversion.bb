SUMMARY = "One version package to rule them all"
DESCRIPTION = "One version package to rule them all, One version package to find them, One version package to bring them all, and in the darkness bind them. \
 \
Make anything a version object, and compare against a vast section of other version formats."
LICENSE = "MIT"

PV = "25.8.0"

RPM_NAME = "python313-awesomeversion-25.8.0-1.5.noarch.rpm"
RPM_HASH = "e352fe2889ade8d9bfff2aaf4a7db695b2ec0a0efb2c315271d86e97272c8a26c5d905d5509ac0e598c3648a537d4d4f6cb1dec50b33ce5b09ab0f4fa53c227a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awesomeversion \
python3.13dist-awesomeversion \
python313-awesomeversion \
python3dist-awesomeversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
