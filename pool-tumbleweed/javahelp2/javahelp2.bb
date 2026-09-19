SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-2.0.05-32.17.noarch.rpm"
RPM_HASH = "bbecb132a50d44195c3b6db5f44b09940f842ab2d951235659b79aa5a84965b05f740fc648c0b522a57e3a312f0fc1c748eae0eaf522b20a1f3a042fe8b8159f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2 \
mvn-javax.help-javahelp"

RDEPENDS:${PN} += "/usr/bin/bash \
glassfish-jsp-api \
glassfish-servlet-api \
java-headless \
javapackages-filesystem"

inherit rpm
