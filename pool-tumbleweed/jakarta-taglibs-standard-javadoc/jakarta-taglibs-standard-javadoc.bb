SUMMARY = "Javadoc for jakarta-taglibs-standard"
DESCRIPTION = "This package contains the javadoc documentation for Jakarta Taglibs."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-javadoc-1.1.2-3.9.noarch.rpm"
RPM_HASH = "09d385ced8058cc7c472d66397da4d2ca80ed4dee6644dc7b82f4c6415a108e0989badd6876a6b50d98b133daeeb1b1a1b0e7b2c2b7ef67622015124b6cb4d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
