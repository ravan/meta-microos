SUMMARY = "FIPS 140-3 specific packages"
DESCRIPTION = "This pattern installs the FIPS 140-3 specific packages that are required \
if you want to run the machine with 'fips=1'. \
 \
Please note that this pattern only enables FIPS 140-3 compliant operation, it does \
not directly make the system FIPS 140-3 certified nor validated. \
 \
Please refer to SUSE official statements on the state of FIPS 140-3 certification."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-fips-20241218-34.1.aarch64.rpm"
RPM_HASH = "76c55817dfbd0900e278b7ff8a4720b208078f133b9e49f55c125b5a5c00e8b586386135c98fb01d0ee1e56ebe4426cbfe1f88ccdcb955f7d4f9044574c581df"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-fips \
patterns-server-enterprise-fips \
patterns-server-enterprise-fips-32bit \
patterns-sles-fips"

RDEPENDS:${PN} += ""

inherit rpm
