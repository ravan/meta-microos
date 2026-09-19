SUMMARY = "Tool for monitor the progress of data through pipes"
DESCRIPTION = "PV ('Pipe Viewer') is a tool for monitoring the progress of data through a \
pipeline. It can be inserted into any normal pipeline between two processes \
to give a visual indication of how quickly data is passing through, how long \
it has taken, how near to completion it is, and an estimate of how long it \
will be until completion."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.0"

RPM_NAME = "pv-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "66654cd71eda27e6a42132b73ca5674185bec040737cdec157b0dc88c095dd56268574ffb4948c6faf4befae3c38737465a3b07e66065961b6824a96991a52d5"

RPROVIDES:${PN} += "pv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
