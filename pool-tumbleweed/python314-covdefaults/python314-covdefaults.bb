SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-covdefaults-2.3.0-3.5.noarch.rpm"
RPM_HASH = "a904ef6b8b89e7fbb5218bf60345d86eb452e6a003e960ed71d8a92dff28a6e770e58ae4eeaf2cf635091ef964350293ff52d6dd1e2d5023e0060172f21bcae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-covdefaults \
python314-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python314-coverage"

inherit rpm
