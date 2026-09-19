SUMMARY = "Calculations for the position of the sun and moon"
DESCRIPTION = "This is 'astral' a Python module which calculates \
 \
* Times for various positions of the sun: dawn, sunrise, solar noon, \
  sunset, dusk, solar elevation, solar azimuth and rahukaalam. \
* The phase of the moon. \
 \
For documentation see the http://astral.readthedocs.io/en/latest/index.html"
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "python313-astral-3.2-2.5.noarch.rpm"
RPM_HASH = "b1fafdba6dd80061246e9e151bb93c98a31cc1f00cf2ca022a2d5a61d194e34343090173dbbd45043e374a77b0d2a870614d85e7604f4b0099cc2fbb7cf6d0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astral \
python3.13dist-astral \
python313-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python313-pytz \
python313-requests"

inherit rpm
