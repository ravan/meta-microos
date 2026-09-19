SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python313-aiodns-4.0.4-1.2.noarch.rpm"
RPM_HASH = "373ea06110edc3cea6f26c2826ef6e7977e64bfb013bdae5b986428ed3582ef0de57e56399f32b11ed1d1f377d16c3a11e12fe24f3866b8d8d94a18ba1c6379d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodns \
python3.13dist-aiodns \
python313-aiodns \
python3dist-aiodns"

RDEPENDS:${PN} += "python-abi \
python313-pycares"

inherit rpm
