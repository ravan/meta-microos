SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.19"

RPM_NAME = "python313-platformio-6.1.19-1.3.noarch.rpm"
RPM_HASH = "88b7e5c147276d35c8d143bd356b317b4b634f57d3c240a18a2cac72e788a6bb11835730b8827a509c65d4bd753503f44361744c8fd1d6c7e507f790ab02198b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformio \
python3.13dist-platformio \
python313-platformio \
python3dist-platformio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-aiofiles \
python313-ajsonrpc \
python313-bottle \
python313-click \
python313-colorama \
python313-marshmallow \
python313-pyelftools \
python313-pyserial \
python313-requests \
python313-semantic-version \
python313-starlette \
python313-tabulate \
python313-uvicorn \
python313-wsproto \
python313-zeroconf \
update-alternatives"

inherit rpm
