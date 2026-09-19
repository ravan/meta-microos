SUMMARY = "Quick and Easy server testing/validation"
DESCRIPTION = "Goss is a YAML based serverspec alternative tool for validating a server’s configuration. It eases the process of writing tests by allowing the user to generate tests from the current system state. Once the test suite is written they can be executed, waited-on, or served as a health endpoint."
LICENSE = "Apache-2.0"

PV = "0.4.9"

RPM_NAME = "goss-0.4.9-2.8.aarch64.rpm"
RPM_HASH = "0a6693cf184c411eb413eae0b482c8d871171c4ffb707e2187bff8f7bd7f313719f5f77dcc0917824424e72118c0dc26acad1070dad93bb2cfa957c4f8149626"

RPROVIDES:${PN} += "goss"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
libc.so.6"

inherit rpm
