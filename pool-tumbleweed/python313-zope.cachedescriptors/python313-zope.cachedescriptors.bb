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

RPM_NAME = "python313-zope.cachedescriptors-6.0-1.4.noarch.rpm"
RPM_HASH = "6c6a81c4aa9e1defaf552e293341ef9968df9faab6bbd0ea3b73dfe53bd0ca0f7e05974e6688cbda6ae42e8ccc4e404025d832f9a4fc511ee2bed5a449cc4a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.cachedescriptors \
python3.13dist-zope.cachedescriptors \
python313-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
