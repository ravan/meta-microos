SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-aiodataloader-0.4.3-1.5.noarch.rpm"
RPM_HASH = "f2f7864e0556cb183a81bbd7f26ce439a5c5398e32c02a91e7440e0f95509e4b43346676cb6eff9beb508071e3fd29f520a8796a8c7a8bd9d3a0332fbcd4a18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiodataloader \
python314-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
