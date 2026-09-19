SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python313-ncclient-0.7.1-1.4.noarch.rpm"
RPM_HASH = "923f7cee7c610ea10f476e8a544abd0ce2a3a19e15cf7f24ccc2a4ed064191baeb1518b28eb89884f2d0436672bce581c95ec263a01b148a06d2c17bbb53b14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ncclient \
python3.13dist-ncclient \
python313-ncclient \
python3dist-ncclient"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-paramiko"

inherit rpm
