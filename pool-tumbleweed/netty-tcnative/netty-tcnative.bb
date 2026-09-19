SUMMARY = "Fork of Tomcat Native with improved OpenSSL and mavenized build"
DESCRIPTION = "netty-tcnative is a fork of Tomcat Native. It includes a set of changes \
contributed by Twitter, Inc, such as: \
 *  Simplified distribution and linkage of native library \
 *  Complete mavenization of the project \
 *  Improved OpenSSL support \
To minimize the maintenance burden, we create a dedicated branch for each stable \
upstream release and apply our own changes on top of it, while keeping the \
number of maintained branches to minimum"
LICENSE = "Apache-2.0"

PV = "2.0.80"

RPM_NAME = "netty-tcnative-2.0.80-1.1.aarch64.rpm"
RPM_HASH = "72e6bb9193534708fd7bce2de474da20ced375c4e079976e584606b0dcdcc5bcd4e4e06c07b68e0ae91d22ca81e8fcd0718e50957e2ae67e7a4ddd84bb72eba5"

RPROVIDES:${PN} += "mvn-io.netty-netty-tcnative-classes \
mvn-io.netty-netty-tcnative-classes-pom- \
netty-tcnative \
osgi-io.netty.tcnative-classes"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
