SUMMARY = "A sandboxing C library for Criterion"
DESCRIPTION = "BoxFort provides an API to run user code in isolated processes. \
 \
Although BoxFort provides some kind of security of the parent process \
against spawned sandboxes, a sandbox has by default the same system \
permissions and access than its parent, and is hence, without care, \
ill-fitted for security purposes. \
 \
The goal of this project is portable code isolation (not security). \
For complete system isolation, consider using containers."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "boxfort-0.1.8-1.1.aarch64.rpm"
RPM_HASH = "102a389ca48e93fa1360afc7ef32730f2a933ee661440decde258c02526d161077db7cd7c68c2fb3b4db537edae5fad45e087b7b4e251faa277b6ed44041d654"

RPROVIDES:${PN} += "boxfort"

RDEPENDS:${PN} += ""

inherit rpm
