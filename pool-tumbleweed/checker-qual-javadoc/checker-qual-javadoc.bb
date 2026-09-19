SUMMARY = "API documentation for checker-qual"
DESCRIPTION = "This package provides API documentation for checker-qual."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-javadoc-3.22.0-2.8.noarch.rpm"
RPM_HASH = "2f5fc44d84f95d5a050c48babc4721e791fbe5f8db61382d373a4818f1db0541dac33fab68ecfe2fa463fee4b839865670305f7e709cc66f87e18892f03c789d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
