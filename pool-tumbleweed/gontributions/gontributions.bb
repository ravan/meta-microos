SUMMARY = "Open source contributions lister"
DESCRIPTION = "Open source contributions lister."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gontributions-0.7.1-1.24.aarch64.rpm"
RPM_HASH = "f41ee9f303104dfa6f2b8d45f84c5a590b5c45a4c2d8670885151d62cbf23c7975ab4b2cf06741dcf9fdbef9655bc7a77ad3f5097fb129bf5ea59fdf38281eb4"

RPROVIDES:${PN} += "gontributions"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
