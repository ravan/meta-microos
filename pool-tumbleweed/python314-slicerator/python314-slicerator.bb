SUMMARY = "A lazy-loading, fancy-sliceable iterable"
DESCRIPTION = "A lazy-loading, fancy-sliceable iterable."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-slicerator-1.1.0-1.4.noarch.rpm"
RPM_HASH = "074544893115842dc02f8e2f9c3c4e41e8d86363419330c4e71350b41c08675357fa74ea89b2967f31033d717c9ec4d542125723f7e8c14fffea342505e744de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-slicerator \
python314-slicerator \
python3dist-slicerator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
