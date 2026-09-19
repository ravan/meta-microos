SUMMARY = "MicroPython remote control"
DESCRIPTION = "This CLI tool provides an integrated set of utilities to remotely interact with \
and automate a MicroPython device over a serial connection."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "mpremote-1.28.0-2.3.noarch.rpm"
RPM_HASH = "70f49a7ca6eca0ea4c8b555ba96dcc2d1152dc307a1ceb35cdf841161720a4bf47c45d5362a4b07101a074e9f1f9b060a433c9b2d3ee65da46b7e81bb87fe53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpremote \
python3.13dist-mpremote \
python3dist-mpremote"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-pyserial"

inherit rpm
