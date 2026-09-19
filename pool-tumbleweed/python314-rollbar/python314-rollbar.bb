SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-rollbar-1.3.0-1.5.noarch.rpm"
RPM_HASH = "09adae116f954506805a45597792e756e12770e0c06d9db99948635864cfe49be9d8084726fe749006d10d504375d200f762d6c55a2baa102bb7477dcaeaee1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rollbar \
python314-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-requests \
update-alternatives"

inherit rpm
