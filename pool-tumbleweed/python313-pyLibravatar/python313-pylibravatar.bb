SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-pyLibravatar-2.0.2-1.2.noarch.rpm"
RPM_HASH = "e5bf16cc64756901846beab05935ab0023784bd42b74baa807cdc9fb1e40d302bfcb787a765e6ef4ac637f21baa1484cacd2b81ca168ba79af045b47cd0c2a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyLibravatar \
python3.13dist-pylibravatar \
python313-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python313-dnspython"

inherit rpm
