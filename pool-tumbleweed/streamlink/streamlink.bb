SUMMARY = "Program to pipe streams from services into a video player"
DESCRIPTION = "Streamlink is a command-line utility which pipes video streams from various \
services into a video player, such as VLC. The main purpose of Streamlink is to \
avoid resource-heavy and unoptimized websites, while still allowing the user to \
enjoy various streamed content."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "8.5.0"

RPM_NAME = "streamlink-8.5.0-1.1.noarch.rpm"
RPM_HASH = "6e315db3c3bcf32639a3bb15e1323a657afbc79ffcdfb480b083fe97e195fa1286019831cb57585b0fa166f5321449c5b113b3bfc45364d367ff02e8a241c44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-streamlink \
python3dist-streamlink \
streamlink"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PySocks \
python3-certifi \
python3-isodate \
python3-lxml \
python3-pycountry \
python3-pycryptodome \
python3-requests \
python3-trio \
python3-trio-websocket \
python3-urllib3 \
python3-websocket-client"

inherit rpm
