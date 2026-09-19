SUMMARY = "Static libraries for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the static libraries for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-static-2.1.12-5.7.aarch64.rpm"
RPM_HASH = "bc6d379fc2a294127a2d618944718a32817b6e46b580881042a3339a39e89a86dfa604d37aa45e2947011ee13d31f2eb84eecb8c04cd177d04caec1b6277e313"

RPROVIDES:${PN} += "libevent-devel-static"

RDEPENDS:${PN} += "libevent-devel"

inherit rpm
