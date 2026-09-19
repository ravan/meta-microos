SUMMARY = "Microsoft Azure Core Library for Python"
DESCRIPTION = "The Azure Core pipeline is a re-structuring of the msrest pipeline introduced in msrest 0.6.0. \
Further discussions on the msrest implementation can be found in the msrest wiki. \
 \
The Azure Core Pipeline is an implementation of chained policies as described in the \
Azure SDK guidelines. \
 \
The Python implementation of the pipeline has some mechanisms specific to Python. \
This is due to the fact that both synchronous and asynchronous implementations of the \
pipeline must be supported independently."
LICENSE = "MIT"

PV = "1.41.0"

RPM_NAME = "python314-azure-core-1.41.0-1.2.noarch.rpm"
RPM_HASH = "fee7238ba3d2bf5be6392b73608c5b6bff1a53e7c41423a4675d859e636a0c787cc113b87cf27fa425acc2021e5da6a5d7d1a8ace978c3be7077803b33d42f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-core \
python314-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-azure-nspkg \
python314-opentelemetry-api \
python314-requests"

inherit rpm
