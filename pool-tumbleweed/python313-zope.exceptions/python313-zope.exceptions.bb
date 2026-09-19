SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python313-zope.exceptions-6.0-1.4.noarch.rpm"
RPM_HASH = "b2c5bd975dc80398e79fdc7ec82e35f666ac31628fd0d52814daea4fed8a355053bfd188c1fb3f5606892bca03ea7d6d81c2080a004477d2b28678030df95ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.exceptions \
python3.13dist-zope.exceptions \
python313-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python313-setuptools \
python313-zope.interface"

inherit rpm
