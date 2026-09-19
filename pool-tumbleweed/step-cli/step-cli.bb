SUMMARY = "Zero trust swiss army knife for working with X509, OAuth, JWT, OATH OTP, etc"
DESCRIPTION = "A zero trust swiss army knife for working with X509, OAuth, JWT, OATH OTP, etc."
LICENSE = "Apache-2.0"

PV = "0.30.6"

RPM_NAME = "step-cli-0.30.6-1.3.aarch64.rpm"
RPM_HASH = "ffe724836971cfdc25ba0dd05ab6fb660f625484f1889893b96bffa21f5734d3ba94c6a40c05ade9481789c769cd95f2a43e7870f3184a18c6a3cacf71c740f1"

RPROVIDES:${PN} += "config-step-cli \
step-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
