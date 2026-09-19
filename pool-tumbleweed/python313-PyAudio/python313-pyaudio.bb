SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.14"

RPM_NAME = "python313-PyAudio-0.2.14-1.3.aarch64.rpm"
RPM_HASH = "f16d7fa2007063616f10560c7adf86085fcd1048f1855679f730c1204a21dc1fed1d02773b2f110a530075fe480ddb6efad2bf7e0c91b095de71158178d8e62c"

RPROVIDES:${PN} += "python3-PyAudio \
python3.13dist-pyaudio \
python313-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
