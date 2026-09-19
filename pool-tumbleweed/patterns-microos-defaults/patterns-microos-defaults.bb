SUMMARY = "openSUSE MicroOS defaults"
DESCRIPTION = "This provides default packages for openSUSE MicroOS which can be optionally \
replaced by alternatives."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-defaults-5.0-111.1.aarch64.rpm"
RPM_HASH = "620e3f1432ebbf56f935d9577d2664eadb5ac36de7fecdf31bc098761f3cbf1455f5628069f2cae49668de84e607eef29d72499cd55e0450f4a26c1eb1ece573"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-defaults"

RDEPENDS:${PN} += "audit \
pattern- \
sndiff"

inherit rpm
