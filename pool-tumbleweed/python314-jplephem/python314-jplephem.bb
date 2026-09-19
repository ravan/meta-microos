SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.24"

RPM_NAME = "python314-jplephem-2.24-1.2.noarch.rpm"
RPM_HASH = "2bc0aa7189e8d8e76b5bb10241e8604fc22a9b64871045b74ae71bc971a48027260b0f4ed8c47fc063d00b272e818579dd90bd6a5db3615bc9e2ceb46e42f148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jplephem \
python314-jplephem \
python3dist-jplephem"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
