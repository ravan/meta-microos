SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python313-etcd-0.4.5-4.22.noarch.rpm"
RPM_HASH = "2c905e6f81ebab83631304764120f6d80dfd3430ddad288851b403eee85d6584ad574a03f05c815ef180d2f069c6053f8ab4fb01f38aca286cf4e54074e13fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-etcd \
python3.13dist-python-etcd \
python313-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python313-dnspython \
python313-urllib3"

inherit rpm
