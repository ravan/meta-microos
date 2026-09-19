SUMMARY = "Source code of Universal Data Plane API"
DESCRIPTION = "This package contains source code of Universal Data Plane API"
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "udpa-source-0.0.1-1.15.noarch.rpm"
RPM_HASH = "4c0eb7766ae4b6dff918c55900cdb86c7af955101fbd5d48e60d180d12239ac4e1d87ecc68fb09712af2c84ea32947a5989903d479c7ae0dc2e60eafeeea7eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udpa-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3"

inherit rpm
