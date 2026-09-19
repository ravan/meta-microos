SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python313-zope.copy-6.0-1.4.noarch.rpm"
RPM_HASH = "bd3f6af455e844726e97741c49e4271e51cf6c522e53b94a6d933087dc87da95fca14e3a77b4ff2ba7e78cb90c09a95e64047a5698aa6212df414b6cf34a9f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.copy \
python3.13dist-zope.copy \
python313-zope.copy \
python3dist-zope.copy"

RDEPENDS:${PN} += "python-abi \
python313-zodbpickle \
python313-zope.interface"

inherit rpm
