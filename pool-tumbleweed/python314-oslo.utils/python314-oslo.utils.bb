SUMMARY = "OpenStack Utils Library"
DESCRIPTION = "The oslo.utils library provides support for common utility type functions, \
such as encoding, exception handling, string manipulation, and time handling."
LICENSE = "Apache-2.0"

PV = "10.2.0"

RPM_NAME = "python314-oslo.utils-10.2.0-1.1.noarch.rpm"
RPM_HASH = "8d513df3d9a755d247c9f098a8e8ea62867b27d9e60725725873f5e7c07ed29b037acee04b3926fc4cbee0e8c04271a23fb9b3459969bb63d75edc847f18effc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.utils \
python314-oslo.utils \
python3dist-oslo.utils"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-debtcollector \
python314-iso8601 \
python314-netaddr \
python314-oslo.i18n \
python314-psutil \
python314-pyparsing \
python314-tzdata"

inherit rpm
