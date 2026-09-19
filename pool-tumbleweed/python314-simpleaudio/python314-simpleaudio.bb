SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python314-simpleaudio-1.0.4-2.7.aarch64.rpm"
RPM_HASH = "332322f0dae200b38e9b7b6195a68c1e823d0798ecb813147b94c3f73d027ae776fe79d4bced273d76fa8f75e93358d381833bdc213f489aeaa61138e0b3047b"

RPROVIDES:${PN} += "python3.14dist-simpleaudio \
python314-simpleaudio \
python3dist-simpleaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
