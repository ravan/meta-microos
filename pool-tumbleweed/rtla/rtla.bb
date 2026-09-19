SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "rtla-7.2.5-8.105.aarch64.rpm"
RPM_HASH = "4510e843fa56b427c6b67aa891f09eea466ef4b8028594f14ca51e6c2fac2dd60c336c413a6ed171d5f8d8254ed809f6dd965e4557186cea080c50743e5ceb92"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
