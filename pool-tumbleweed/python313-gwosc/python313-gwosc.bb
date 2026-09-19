SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-gwosc-0.7.1-1.14.noarch.rpm"
RPM_HASH = "136aeab992d52c2be3fef7825d558c0354d4106ab0c5a014c1721b29dbcbaaed1064b0242da60c90574f2dff261e0d81bfcd5cc31b507ed98afc4e4d1fefb664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwosc \
python3.13dist-gwosc \
python313-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
