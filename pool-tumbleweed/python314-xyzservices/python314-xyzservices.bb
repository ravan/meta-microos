SUMMARY = "Source of XYZ tiles providers"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static."
LICENSE = "BSD-3-Clause"

PV = "2026.9.1"

RPM_NAME = "python314-xyzservices-2026.9.1-1.1.noarch.rpm"
RPM_HASH = "e099bc6e5d4b395542b05ca5eb2baadb02b5c9989ded03ac158f0cb3f662afaf94029bd5a49d07d0bc8a13bd4bdb8b6d30f30b44559029a266569e81debfc4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xyzservices \
python314-xyzservices \
python3dist-xyzservices"

RDEPENDS:${PN} += "python-abi \
xyzservices-data"

inherit rpm
