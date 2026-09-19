SUMMARY = "Root Plexus Projects POM"
DESCRIPTION = "The Plexus project provides a full software stack for creating and \
executing software projects.  This package provides parent POM for \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "27"

RPM_NAME = "plexus-pom-27-1.1.noarch.rpm"
RPM_HASH = "604cd29af3eca5e7b0cef605cf07af5d52e91a3b8dc54214f33181b4e6d1b6d92b5d913159d2da4b15b773cb10ac6abde4ab88309f7a0bcaed4554b89f3642f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-pom- \
plexus-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
