SUMMARY = "Low-Level Event Loop Management Library"
DESCRIPTION = "Liboop is a low-level event loop management library for POSIX-based \
operating systems. It supports the development of modular, multiplexed \
applications that may respond to events from several sources. It \
replaces the 'select() loop' and allows the registration of event \
handlers for file and network I/O, timers, and signals. Because \
processes use these mechanisms for almost all external communication, \
liboop can be used as the basis for almost any application."
LICENSE = "LGPL-2.1+"

PV = "1.0.1"

RPM_NAME = "liboop4-1.0.1-2.29.aarch64.rpm"
RPM_HASH = "7839aca6ce64a87efa33c56c4cba3c999d02b417afd9975ac89da0185de1617d5c2138c903052dec72a57937201a61af5b97f7e2bcc2c9b03f50a2778044b628"

RPROVIDES:${PN} += "liboop.so.4 \
liboop4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
