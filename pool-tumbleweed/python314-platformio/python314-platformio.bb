SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.19"

RPM_NAME = "python314-platformio-6.1.19-1.3.noarch.rpm"
RPM_HASH = "b540057f40bec1dae2621cd29f49e2229afcf4d51c89ac7d050688f4264bd7bca3428b746922ac6580dbc091404bfc562f5e17b109de8418dd986ab4083899c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-platformio \
python314-platformio \
python3dist-platformio"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-aiofiles \
python314-ajsonrpc \
python314-bottle \
python314-click \
python314-colorama \
python314-marshmallow \
python314-pyelftools \
python314-pyserial \
python314-requests \
python314-semantic-version \
python314-starlette \
python314-tabulate \
python314-uvicorn \
python314-wsproto \
python314-zeroconf \
update-alternatives"

inherit rpm
