SUMMARY = "Utility for finding interesting messages in log files"
DESCRIPTION = "logwarn searches for interesting messages in log files, where ``interest- \
ing'' is defined by an user-supplied list of positive and negative (pre- \
ceeded with a ``!'') extended regular expressions provided on the command \
line. \
 \
Each log message is compared against each pattern in the order given.  If \
the log message matches a positive pattern before matching a negative \
!pattern then it's printed to standard output. \
 \
logwarn keeps track of its position between invocations, so each matching \
line is only ever output once.  It also finds messages in log files that \
have been rotated (and possibly compressed) since the previous invoca- \
tion. \
 \
logwarn also includes support for log messages that span multiple lines."
LICENSE = "Apache-2.0"

PV = "1.0.17"

RPM_NAME = "logwarn-1.0.17-1.13.aarch64.rpm"
RPM_HASH = "06142450c8e2000058e01be9cf57e5bd6af5229c4012de851fec7ed8e60f476c275aec54bfaa5729116e3d7a647cbb29f3ed8c616d136ede0469913bfcc376a9"

RPROVIDES:${PN} += "logwarn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
