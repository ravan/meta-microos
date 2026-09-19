SUMMARY = "Python 3 utility libraries for Ceph CLI"
DESCRIPTION = "This package contains types and routines for Python 3 used by the Ceph CLI as \
well as the RESTful interface. These have to do with querying the daemons for \
command-description information, validating user command input against those \
descriptions, and submitting the command to the appropriate daemon."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-ceph-argparse-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "73a1c9db28e3ffdff53987f9884fb661506cd31139abbba4eec84df81e2abeb810f0f97c59eac68037ed12b67dba958e96aedb136405d6ed7af8414caba550b5"

RPROVIDES:${PN} += "python3-ceph-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
