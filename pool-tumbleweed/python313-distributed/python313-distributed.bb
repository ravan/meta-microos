SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python313-distributed-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "2b34b360001e77e588b250ac8ca0784871a06a87fb7788c916de62035f79349217639d0240c1dfeac2353793162fcd93ffee4190f1531ed7eb752fd72acdb123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distributed \
python3.13dist-distributed \
python313-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-click \
python313-cloudpickle \
python313-dask \
python313-locket \
python313-msgpack \
python313-packaging \
python313-psutil \
python313-sortedcontainers \
python313-tblib \
python313-toolz \
python313-tornado \
python313-zict"

inherit rpm
