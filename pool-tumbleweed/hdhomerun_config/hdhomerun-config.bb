SUMMARY = "HDHomeRun Config tool"
DESCRIPTION = "hdhomerun_config is a command line tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config-20190621-2.11.aarch64.rpm"
RPM_HASH = "7979ff56de5cb871ae450ce0ddd01efb0259d583c1d0fb21518e71fcec92301230d7c0a2860f405b2eb19eb18932684fb55ed999e5504070aa92149a0cde8c43"

RPROVIDES:${PN} += "hdhomerun-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
