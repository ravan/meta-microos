SUMMARY = "Development headers for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-devel-3.11.7-1.1.noarch.rpm"
RPM_HASH = "6380054c024494320d250ed87e4c5d02d53f06f64c80f43f379adae30f4b3c4c4e52a21c1fac83ca6b8f7851e96bd602256abcb2c13251b54f5f476681522677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-devel"

RDEPENDS:${PN} += "postfix"

inherit rpm
