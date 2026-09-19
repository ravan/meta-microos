SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.24"

RPM_NAME = "python313-jplephem-2.24-1.2.noarch.rpm"
RPM_HASH = "26d064601b3dce108d368edff562932ed3cc7f25d1ce0497c5bd4b9d7e17ea5beb1e6824bf281eadd2be6362216b69795c7ceadd8772f93e7cb0ba41423e5856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jplephem \
python3.13dist-jplephem \
python313-jplephem \
python3dist-jplephem"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
