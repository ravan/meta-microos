SUMMARY = "Glassfish J2EE JSP API specification"
DESCRIPTION = "This project provides a container independent specification of JSP \
2.2. Note that this package doesn't contain implementation of this \
specification. See glassfish-jsp for one of implementations"
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-2.3.3-6.8.noarch.rpm"
RPM_HASH = "43a25d4cac126b3fde3c917fbd49a42ead3d784c8f8273d178165f0d346e5c1a526c73afb2e2dfc43633fbd6f7dba5db86fc054b883c9b99f6d1306792e5f2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api \
mvn-javax.servlet-jsp-api \
mvn-javax.servlet-jsp-api-pom- \
mvn-javax.servlet.jsp-javax.servlet.jsp-api \
mvn-javax.servlet.jsp-javax.servlet.jsp-api-pom- \
mvn-javax.servlet.jsp-jsp-api \
mvn-javax.servlet.jsp-jsp-api-pom- \
osgi-javax.servlet.jsp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.el-javax.el-api \
mvn-javax.servlet-javax.servlet-api"

inherit rpm
