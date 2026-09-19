SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-aiodataloader-0.4.3-1.5.noarch.rpm"
RPM_HASH = "2083f1f876759f9e654861186d38e728b750f91c15b4928c00c7fd32108c7145b1aa0fe16771339a588183905dcc4b4953c840541d46cc561387e65c21462d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodataloader \
python3.13dist-aiodataloader \
python313-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
