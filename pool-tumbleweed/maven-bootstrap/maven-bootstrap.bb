SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.10.0~rc1"

RPM_NAME = "maven-bootstrap-3.10.0~rc1-1.1.noarch.rpm"
RPM_HASH = "5480673bdaeeb70b51fcef9eed6de1087e12809c0d430b723cb901986f899cc964a468a19dbcfafdac67c2b4b5fb9a2b1cf28aa70d930673bb07ec545f25258b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-bootstrap"

RDEPENDS:${PN} += ""

inherit rpm
