SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.5"

RPM_NAME = "python313-mailmanclient-3.3.5-4.3.noarch.rpm"
RPM_HASH = "6450a17b958295c2831353ab04851e43e4bde98dfd4049bee7bf54dc7619559315db2b552beeaf7bb771dec18cb5d5eda324a614d0c0cc048996575121847399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailmanclient \
python3.13dist-mailmanclient \
python313-mailmanclient \
python3dist-mailmanclient"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
