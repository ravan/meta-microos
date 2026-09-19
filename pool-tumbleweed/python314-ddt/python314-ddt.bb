SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python314-ddt-1.7.2-2.5.noarch.rpm"
RPM_HASH = "dbc7c03ac06520552e2b31b4d0e5be442dde11e19962d669968828115c78c6e4c3c75540c8a756c75b3e1733ace3c6075a107889df6f9b4e866dff6b94f14869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ddt \
python314-ddt \
python3dist-ddt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
