SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "3.1"

RPM_NAME = "python314-lazr.config-3.1-1.2.noarch.rpm"
RPM_HASH = "db7685504d1ff346059a495309764081a0a53091d00c3eac9a8c7152419d8d1ff68d9759db8cc579229e15da417880e04ef112295388bc32d96b13c987a22abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazr.config \
python314-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python314-lazr.delegates \
python314-zope.interface"

inherit rpm
