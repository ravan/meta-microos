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

RPM_NAME = "python314-astral-3.2-2.5.noarch.rpm"
RPM_HASH = "74cb895efe2e9bfdf05772548ce0e24a4c90c059c9d2cdefb4029356f3a2cf9b22a13b9fdec4df773e8c3692dae1cb3794e7bc4ede227d78ed022b68e5abce9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-astral \
python314-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python314-pytz \
python314-requests"

inherit rpm
