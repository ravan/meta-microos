SUMMARY = "Demonstration and sample files for jdepend"
DESCRIPTION = "JDepend traverses a set of Java class and source file directories and \
generates design quality metrics for each Java package. JDepend allows \
you to automatically measure the quality of a design in terms of its \
extensibility, reusability, and maintainability to effectively manage \
and control package dependencies. \
 \
This package contains demonstration and sample files for JDepend."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-demo-2.10-4.9.noarch.rpm"
RPM_HASH = "7b68312707757a0644c989d9806becddaede4e2b13e074c07c5bfc77e8aa9bd8731bcced47379b448b6d334880d078913df875e2e76347f94d8b77cc394b8b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend-demo"

RDEPENDS:${PN} += "jdepend"

inherit rpm
