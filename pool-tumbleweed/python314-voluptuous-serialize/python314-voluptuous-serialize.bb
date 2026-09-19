SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python314-voluptuous-serialize-2.7.0-1.5.noarch.rpm"
RPM_HASH = "0c322044d365f152cec3a15a577d5f1ae42726098badbc4ef29a133bc8da427832741c6c82d565f5608b167825965ac3cab83417ef99201f1051ee9520dd1bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-voluptuous-serialize \
python314-voluptuous-serialize \
python3dist-voluptuous-serialize"

RDEPENDS:${PN} += "python-abi \
python314-voluptuous"

inherit rpm
