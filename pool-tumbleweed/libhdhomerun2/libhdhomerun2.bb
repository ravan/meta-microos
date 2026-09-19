SUMMARY = "HDHomeRun library"
DESCRIPTION = "HDHomeRun configuration library allows you to discover HDHomeRun ATSC/QAM/DVB \
TV tuners on the network. It can configure the tuners, scan for channels, and \
retrieve information, including signal strength. A shared library is included \
for linking by client applications and a simple console application is included \
for scripting."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun2-20190621-2.11.aarch64.rpm"
RPM_HASH = "c302e8764cb2a1302ea88bf5f0a22685904101dd4984df76b933a25a3276562eebe9031cad1aca4b6ae7fceba19328fef317136297cd057ec1d3f6d823f80a54"

RPROVIDES:${PN} += "libhdhomerun.so.2 \
libhdhomerun2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
