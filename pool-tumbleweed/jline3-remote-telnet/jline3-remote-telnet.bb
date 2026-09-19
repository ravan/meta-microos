SUMMARY = "JLine Remote Telnet"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the helpers for using jline over telnet (including \
a telnet server implementation)."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-remote-telnet-3.30.16-1.2.noarch.rpm"
RPM_HASH = "32a70b08168c5475b301bfbe1ba543b11098b5c1ec7f156bb8abd4a3065d14ea668b0610aa7bd5df691cd8173196f3d1c9cd1e0028ec864d3c04bdbb4389063f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-remote-telnet \
mvn-org.jline-jline-remote-telnet \
mvn-org.jline-jline-remote-telnet-pom- \
osgi-org.jline.remote-telnet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-builtins"

inherit rpm
