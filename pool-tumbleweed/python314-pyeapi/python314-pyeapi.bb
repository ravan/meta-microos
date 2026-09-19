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

RPM_NAME = "python314-pyeapi-1.0.4-1.7.noarch.rpm"
RPM_HASH = "a8e0ef782ffe5816a25c9ccd8f16755d56b534b08ccd985f0c27c1ff2676ba14d7426352f7a4c2dda838cfe8a3e7f4931ff6cc669d82a94b93990efc5978bcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyeapi \
python314-pyeapi \
python3dist-pyeapi"

RDEPENDS:${PN} += "python-abi \
python314-netaddr"

inherit rpm
