SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-simpleaudio-1.0.4-2.7.aarch64.rpm"
RPM_HASH = "4cce6f110d40826bc861ee8646db230e4e8580ff56de34f0cb0d6ad7a90c93187442d4e3d639a029c28728a6918d88de1cd15eb00b5e2f084c359539a49cba57"

RPROVIDES:${PN} += "python3-simpleaudio \
python3.13dist-simpleaudio \
python313-simpleaudio \
python3dist-simpleaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
