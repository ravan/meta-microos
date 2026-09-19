SUMMARY = "Small program answering GTP ECHO Request with GTP ECHO Response"
DESCRIPTION = "Small program answering GTP ECHO Request with GTP ECHO Response for both GTPCv1 \
and GTPCv2."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "gtp-echo-responder-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "8ba032426f21672d87841afef56bde98b4aff27e805b0848c42490e0302237edd5f96af7d0070a5c85a92a1bdf077fa67552c8b1b2ca50c99f3e3e821143927b"

RPROVIDES:${PN} += "gtp-echo-responder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
