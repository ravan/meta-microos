SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-distributed-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "f8f6e7389e5748952aecb4fe151bc8b0e93ffc728b2e0afc7abc1b434e8371e0c28e3cc6bbdf343f48955175f6b73e80afdbef6b76f6b15239a23de9bfc2dd4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-distributed \
python314-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-PyYAML \
python314-click \
python314-cloudpickle \
python314-dask \
python314-locket \
python314-msgpack \
python314-packaging \
python314-psutil \
python314-sortedcontainers \
python314-tblib \
python314-toolz \
python314-tornado \
python314-zict"

inherit rpm
