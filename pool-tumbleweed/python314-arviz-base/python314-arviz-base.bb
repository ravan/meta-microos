SUMMARY = "Base ArviZ features and converters"
DESCRIPTION = "Base ArviZ features and converters."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-arviz-base-1.3.0-1.1.noarch.rpm"
RPM_HASH = "5cc66ccea9b71e4e73664a4400cd061f26903b0d31b5282361449223c3a32803f912ae7b8f2389aa4ba6bc7782b37a7e1ab6dba3ee7cfd55aaf200658b07fabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arviz-base \
python314-arviz-base \
python3dist-arviz-base"

RDEPENDS:${PN} += "python-abi \
python314-lazy-loader \
python314-numpy \
python314-typing-extensions \
python314-xarray"

inherit rpm
