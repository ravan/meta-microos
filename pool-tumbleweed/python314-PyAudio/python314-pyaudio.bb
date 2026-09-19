SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.14"

RPM_NAME = "python314-PyAudio-0.2.14-1.3.aarch64.rpm"
RPM_HASH = "99671d5979b36caf6d7c0ed84850aa3278661d3c4d895bbe42fa560126e8be0f37eb9262f5a91d9f03ba2ea10d89c7616423cabacb3e66f587b5a50c406fc60c"

RPROVIDES:${PN} += "python3.14dist-pyaudio \
python314-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
