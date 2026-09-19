SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.5.4"

RPM_NAME = "python313-pyrad-2.5.4-1.4.noarch.rpm"
RPM_HASH = "035dc2ca833f164626deac41e0c5891a149c1f9d07f55a1e42e35d2607c93159ead1b321f5a761e7e6d7e36d5c8f562e384f16a32497f17e218c683ad3d03a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyrad \
python3.13dist-pyrad \
python313-pyrad \
python3dist-pyrad"

RDEPENDS:${PN} += "python-abi \
python313-netaddr"

inherit rpm
