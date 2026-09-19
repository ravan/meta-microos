SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.26.8"

RPM_NAME = "go1.26-race-1.26.8-1.1.aarch64.rpm"
RPM_HASH = "3526abd650cf04e09eb45113b0a6282c11938ac38b83e26bb01e0d85218b83f32fff65bcc29b9a113616a598c6f56fadce1e44847e93ffa46453af60bdb67bc1"

RPROVIDES:${PN} += "go1.26-race"

RDEPENDS:${PN} += "go1.26"

inherit rpm
