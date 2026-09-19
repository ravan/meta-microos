SUMMARY = "Python library for kaitaistruct"
DESCRIPTION = "This library implements the Kaitai Struct API for Python. \
 \
Kaitai Struct is a declarative language used to describe various binary data \
structures, laid out in files or in memory: i.e. binary file formats, network \
stream packet formats, etc. \
 \
It is similar to Python’s [construct] and [Construct3], but it is \
language-agnostic. \
The format description is done in YAML-based .ksy format, which then can be \
compiled into a wide range of target languages."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python314-kaitaistruct-0.11-1.4.noarch.rpm"
RPM_HASH = "bf230c026d85dfde158669e523f659dd84f2d1c6aac2ceba3977f06f4fe15ebdef05d583979caf94c3eecb732ca63493a9925c6d73db591fd6841527c3358409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kaitaistruct \
python314-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
