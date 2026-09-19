SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-rollbar-1.3.0-1.5.noarch.rpm"
RPM_HASH = "b6143dcbf116466ffd86cb6054475643ef40e2fa6a462efe1af50bed251d13d34be8f71c63f90de6de73b579ff9db6564683e6b6439b66ed75e5d5225fd87891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rollbar \
python3.13dist-rollbar \
python313-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-requests \
update-alternatives"

inherit rpm
