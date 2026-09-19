SUMMARY = "Documentations for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program. \
This package contains the documentation for postfix"
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-doc-3.11.7-1.1.noarch.rpm"
RPM_HASH = "137a46b33d687051db7ebdba2b97ed27e73d6f9c7331d9997cb67b3b6eab670dbf619a6a408da6b42ace89e620a3e209a8a2ccdccfac90363cff399d738542cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
