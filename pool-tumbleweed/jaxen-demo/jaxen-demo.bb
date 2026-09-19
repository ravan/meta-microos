SUMMARY = "Samples for jaxen"
DESCRIPTION = "Samples for jaxen."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "jaxen-demo-2.0.0-1.11.noarch.rpm"
RPM_HASH = "66e4f272f511da0033f87b832aedfcee57dcf0ca5f5035b752c81d4885a5b3b1bfe95e5ad607b9c0f5bec5416bb817d095d9f03910be2d53dba6ba6d20d67ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen-demo"

RDEPENDS:${PN} += "jaxen"

inherit rpm
