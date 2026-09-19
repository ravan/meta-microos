SUMMARY = "Javadoc for maven-script-interpreter"
DESCRIPTION = "API documentation for maven-script-interpreter."
LICENSE = "Apache-2.0"

PV = "1.8"

RPM_NAME = "maven-script-interpreter-javadoc-1.8-1.1.noarch.rpm"
RPM_HASH = "1df6bf36577e2125c60c623c7fa8e889948a1efbbc1ecaff68d4533c33524cded5693ede5075839fdbd05290d59c9f3667393826ba01767208b4d01cdcb2071f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
