SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "12.3.0"

RPM_NAME = "python314-Pillow-tk-12.3.0-2.2.aarch64.rpm"
RPM_HASH = "daa39c609ac9b7d39d5053ac5e2109014283ee79e438473ea783aad0f5aaee39b6ff17789a57672901fd20d324458e07e6b5f735804acf93c83140d837ad5c92"

RPROVIDES:${PN} += "python314-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Pillow \
python314-tk"

inherit rpm
