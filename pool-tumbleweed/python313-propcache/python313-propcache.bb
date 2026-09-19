SUMMARY = "Accelerated property cache"
DESCRIPTION = "Accelerated property cache"
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python313-propcache-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "d948918ac4f7999bdd06b8514ecfd7ea01e998c9334cb17bf5fc8f755f9316e335da7533de625d61c80460b3e91d7cde3547700e61accfa49ffe4220f55c5123"

RPROVIDES:${PN} += "python3-propcache \
python3.13dist-propcache \
python313-propcache \
python3dist-propcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
