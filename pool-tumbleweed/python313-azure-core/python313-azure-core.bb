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

RPM_NAME = "python313-azure-core-1.41.0-1.2.noarch.rpm"
RPM_HASH = "6434f731e356a38488513e2c40cd83cf286c6aefd272a7363f386c7d901e8a505a2d44c1243db6af1af788f704e8d8b9c6ef021c7f56bcb8f61fd74a1842f8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core \
python3.13dist-azure-core \
python313-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-azure-nspkg \
python313-opentelemetry-api \
python313-requests"

inherit rpm
