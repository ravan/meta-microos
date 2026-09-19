SUMMARY = "Data files for STK, a music synthesis library"
DESCRIPTION = "Data files for STK."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-data-4.6.2-1.14.noarch.rpm"
RPM_HASH = "eca5d34b396aadea4ca61261fd5e728eff5d02ab6ba471e24ec615780f2f3ba8cd0f2b971eb13bf8408b3bfb74dbfd4e3bf7090e9817127609e57df0e304e745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stk-data"

RDEPENDS:${PN} += ""

inherit rpm
