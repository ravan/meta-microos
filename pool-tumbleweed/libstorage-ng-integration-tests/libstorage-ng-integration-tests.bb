SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng-integration-tests-4.5.352-1.1.noarch.rpm"
RPM_HASH = "2dc4adf89f5f0535a90190a121cf55a39c0e51a563c86e0a0da99429a950ac5586cf8abc5be66c40ab9abff0069e1d6338a44b9f761636172f6d926f2cdbcf9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
