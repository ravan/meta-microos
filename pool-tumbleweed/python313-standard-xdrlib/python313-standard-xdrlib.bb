SUMMARY = "Standard library xdrlib redistribution. 'dead battery'"
DESCRIPTION = "Standard library xdrlib redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-xdrlib-3.13.0-1.5.noarch.rpm"
RPM_HASH = "2b3b0423682afdaf4b3d5b2c4be9f855bb3c35d6cc6dbdd0267982d72774e18f3e13302762d7dfa0cfac911316f4877492ed7ec0411c17e8f53e4736b03b0d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-xdrlib \
python3.13dist-standard-xdrlib \
python313-standard-xdrlib \
python3dist-standard-xdrlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
