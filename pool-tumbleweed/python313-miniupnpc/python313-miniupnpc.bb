SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "python313-miniupnpc-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "c9281b4eb2c4884fb51482f88607799d56587c12749431e76edf36838413df2e606a77b4c00205cb53caede5eda05feb1fd46b2c46ae9ace14b367c03dd8c7f4"

RPROVIDES:${PN} += "python3-miniupnpc \
python3.13dist-miniupnpc \
python313-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc21 \
python-abi"

inherit rpm
