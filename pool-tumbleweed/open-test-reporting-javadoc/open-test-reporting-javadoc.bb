SUMMARY = "Javadoc for open-test-reporting"
DESCRIPTION = "This package contains the API documentation for open-test-reporting."
LICENSE = "Apache-2.0"

PV = "0.1.0~M2"

RPM_NAME = "open-test-reporting-javadoc-0.1.0~M2-2.9.noarch.rpm"
RPM_HASH = "126a1400219dbec7f895139b41de246c3805a56e1a35d8fc2651d0f1df0cfaa331b0d83542b140546df761d8defe77f2604f68b152e5036f4aa9a739850f56dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "open-test-reporting-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
