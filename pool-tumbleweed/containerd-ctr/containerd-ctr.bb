SUMMARY = "Client for containerd"
DESCRIPTION = "Standalone client for containerd, which allows management of containerd containers \
separately from Docker."
LICENSE = "Apache-2.0"

PV = "1.7.33"

RPM_NAME = "containerd-ctr-1.7.33-1.3.aarch64.rpm"
RPM_HASH = "0e4fc4ad8b33ffaa35f16629b0c8dd04fb5cff0a9485ac806a0fe742155575a5924379a837cd22633bbf8ee54f530ea0be507c102a16afd1190f73e280da1a7d"

RPROVIDES:${PN} += "containerd-ctr"

RDEPENDS:${PN} += "containerd \
libc.so.6"

inherit rpm
