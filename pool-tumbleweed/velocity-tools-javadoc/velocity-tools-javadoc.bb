SUMMARY = "Javadoc for velocity-tools"
DESCRIPTION = " \
VelocityTools is an integrated collection of Velocity subprojects \
with the common goal of creating tools and infrastructure to speed \
and ease development of both web and non-web applications using the \
Velocity template engine. \
 \
This package contains Javadoc documentation"
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "velocity-tools-javadoc-3.2-1.5.noarch.rpm"
RPM_HASH = "12edea2819a895afdfa3d61b64da566d055b5c59a5911634dd873d23ce4b51e1bc2f3d2dcc5a79f7633e5a577e4bc7f0f2a6f35205aa64f37a84ccce0c024551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
