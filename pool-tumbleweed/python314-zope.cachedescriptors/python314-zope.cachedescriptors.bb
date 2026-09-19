SUMMARY = "Method and property caching decorators"
DESCRIPTION = "Cached descriptors cache their output.  They take into account \
instance attributes that they depend on, so when the instance \
attributes change, the descriptors will change the values they \
return. \
 \
Cached descriptors cache their data in _v_ attributes, so they are \
also useful for managing the computation of volatile attributes for \
persistent objects."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-zope.cachedescriptors-6.0-1.4.noarch.rpm"
RPM_HASH = "78e0e4c134e948ff6cc38482d600b5ec92fed6831f9f3168b8a2cc150ae61b54b85cca3f3a58581a7cf84d4d68dc6e004f996a3e37fc90b8b78810008a688feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.cachedescriptors \
python314-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
