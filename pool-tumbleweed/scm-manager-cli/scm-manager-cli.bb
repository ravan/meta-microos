SUMMARY = "Command line interface for SCM-Manager"
DESCRIPTION = "Command line interface for SCM-Manager"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "scm-manager-cli-1.0.1-1.14.aarch64.rpm"
RPM_HASH = "b3aa21e6ad3bd90db42c7f74eb54673d041ff418e84e5d4b56ddaf0dff4f2cda9079d894bd054c644965040b1952015e5abe263c6acd21bb4e17300f0088047e"

RPROVIDES:${PN} += "scm-manager-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
