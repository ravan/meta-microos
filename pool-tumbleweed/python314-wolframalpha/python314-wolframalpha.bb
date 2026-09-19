SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.1.3"

RPM_NAME = "python314-wolframalpha-5.1.3-1.2.noarch.rpm"
RPM_HASH = "d52a2a2aa47633a03e83d8e95d0008b3138386e3b5ae52ed346cb2025a4597f377694f123622b282f4cf084d8cb06ea28d47a0b7e83b261ac2fa90b6a3fd43c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wolframalpha \
python314-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-jaraco.context \
python314-more-itertools \
python314-multidict \
python314-xmltodict"

inherit rpm
