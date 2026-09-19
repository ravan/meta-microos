SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python313-opencensus-ext-threading-0.1.2-4.8.noarch.rpm"
RPM_HASH = "865ce6c5dc194db29685099fdc9df7409f985ec458c6a0c6683fca22edbe6afa8cfda99d326de2d38258ef2cb68113b50bf192037555bf3cef546b9d4db89e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-threading \
python3.13dist-opencensus-ext-threading \
python313-opencensus-ext-threading \
python3dist-opencensus-ext-threading"

RDEPENDS:${PN} += "python-abi \
python313-opencensus"

inherit rpm
