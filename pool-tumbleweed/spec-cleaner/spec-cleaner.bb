SUMMARY = ".spec file cleaner"
DESCRIPTION = "This script cleans spec file according to some arbitrary style guide. The \
results it produces should always be checked by someone since it is not and \
will never be perfect."
LICENSE = "BSD-3-Clause"

PV = "1.2.4+2"

RPM_NAME = "spec-cleaner-1.2.4+2-1.4.noarch.rpm"
RPM_HASH = "9642307a2769ed8fcff4713e571b5dd7be8ced7960b870f81510dc516dc2c050d4588472ea373406824e9e59ff0633d1efb73878080fc4c68a9df4a188670dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-spec-cleaner \
python3dist-spec-cleaner \
spec-cleaner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-python-rpm-spec"

inherit rpm
