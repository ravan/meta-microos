SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-minimal-4.3.0-8.1.aarch64.rpm"
RPM_HASH = "077e90953596e6ce4647bb2862c14b7de0cc477d16a3f39b1945ec9b4f7dbeff96e6cea1de3cb63047c338f2cd4c505142f009ad35704b4b66203ce26c114671"

RPROVIDES:${PN} += "xmvn-minimal"

RDEPENDS:${PN} += "/usr/bin/sh \
maven-lib \
xmvn-api \
xmvn-connector \
xmvn-core"

inherit rpm
