SUMMARY = "Simple retry client for aiohttp"
DESCRIPTION = "Simple retry client for aiohttp."
LICENSE = "MIT"

PV = "2.9.1"

RPM_NAME = "python313-aiohttp-retry-2.9.1-3.4.noarch.rpm"
RPM_HASH = "79c537f8f9499f0082715820874e6816fceda545e7cf48bd53366c5fed6b06e0edb6db97310eeda60a0185b6bd64bc412aa633354c3012e19ab6200918241b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-retry \
python3.13dist-aiohttp-retry \
python313-aiohttp-retry \
python3dist-aiohttp-retry"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp"

inherit rpm
