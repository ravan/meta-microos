SUMMARY = "Python Client for eAPI"
DESCRIPTION = "The Python Client for eAPI (pyeapi) is a native Python library wrapper around \
Arista EOS eAPI.  It provides a set of Python language bindings for configuring \
Arista EOS nodes. \
 \
The Python library can be used to communicate with EOS either locally \
(on-box) or remotely (off-box). It uses a standard INI-style configuration file \
to specify one or more nodes and connection profiles. \
 \
The pyeapi library also provides an API layer for building native Python \
objects to interact with the destination nodes. The API layer is a convenient \
implementation for working with the EOS configuration and is extensible for \
developing custom implementations."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python313-pyeapi-1.0.4-1.7.noarch.rpm"
RPM_HASH = "bda3b9e7384d981ff0368bc3bf54d4a8296dd01fcc0b26c6083925fcd0d8e2bcde766838b77438aa183d2b15fbd3c93faf0cd576c9f636710c3209dfde2a0ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyeapi \
python3.13dist-pyeapi \
python313-pyeapi \
python3dist-pyeapi"

RDEPENDS:${PN} += "python-abi \
python313-netaddr"

inherit rpm
