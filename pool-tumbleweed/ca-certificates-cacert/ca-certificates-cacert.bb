SUMMARY = "CAcert root certificates"
DESCRIPTION = "This package contains the root certificates from cacert.org"
LICENSE = "SUSE-CacertRoot"

PV = "1"

RPM_NAME = "ca-certificates-cacert-1-23.11.noarch.rpm"
RPM_HASH = "196a83f77184756e9638818ac3538184731e4bdcca4fc561debf025431fdd5e4baa350ac6b943a0fb5a5c066950b8ee8daa9b96cf29965a8a7cae0829f7c4520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-cacert"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates"

inherit rpm
