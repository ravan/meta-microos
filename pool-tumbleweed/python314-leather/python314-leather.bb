SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python314-leather-0.3.4-3.5.noarch.rpm"
RPM_HASH = "4f19d69b41a7c3cc2c205521adc5b8c886321e035ece8e926caa4ffeb3a58fe81cf82fbdbc9f65d84f7e0c9dcf0fe55f7b7d602fa59baf4e39ac10efaddb8971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-leather \
python314-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
