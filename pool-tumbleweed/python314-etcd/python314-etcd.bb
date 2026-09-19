SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python314-etcd-0.4.5-4.22.noarch.rpm"
RPM_HASH = "bf2602b9c0f86ddf3869cc43fe404a64f83e686b35dde051902b37a88042a42889adf25cee50af079b7d47a2afb0099f675c8567189ecf0f42254f1ef220d557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-etcd \
python314-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python314-dnspython \
python314-urllib3"

inherit rpm
