SUMMARY = "Javadoc for apache-commons-pool2"
DESCRIPTION = "The goal of Pool 2.x package it to create and maintain an object (instance) \
pooling package to be distributed under the ASF license. The package \
should support a variety of pool implementations, but encourage support \
of an interface that makes these implementations interchangeable. \
 \
This package contains the javadoc documentation for the Apache Commons \
Pool 2.x Package."
LICENSE = "Apache-2.0"

PV = "2.13.1"

RPM_NAME = "apache-commons-pool2-javadoc-2.13.1-1.3.noarch.rpm"
RPM_HASH = "2de20ba5c9897a1df87277bdbc904cdba4c393bc6e49796f93f40583282dbb69ec9e8bb889ea2188920d6074489249277c757ea5c980fbbc5b68daa741936187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
