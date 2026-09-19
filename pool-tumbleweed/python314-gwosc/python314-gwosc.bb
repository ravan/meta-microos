SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-gwosc-0.7.1-1.14.noarch.rpm"
RPM_HASH = "4f0440f5f80e74d884735be746cc076bad65d6fb3154dfda7d7556101cdaf9848d933b2b02a2a966e22df57e0089bd4346f50cd2df39c39810c30da956843e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gwosc \
python314-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
