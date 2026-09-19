SUMMARY = "Development files for aws-c-auth library"
DESCRIPTION = "AWS C99 library implementation of AWS client-side authentication: \
standard credentials providers and signing. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.10.5"

RPM_NAME = "aws-c-auth-devel-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "2c6ae902c45bc5bddab6a59eaab694caf552a7dba057df85c20fd8f75560300ba19081eeb60ce60c29ae845903863ffa1320aeba74133de9feb3ac6575923fc3"

RPROVIDES:${PN} += "aws-c-auth-devel \
cmake-aws-c-auth"

RDEPENDS:${PN} += "libaws-c-auth1-0-0"

inherit rpm
