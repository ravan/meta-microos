SUMMARY = "Java Web Start and plugin implementation (API documentation)"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project. \
This package contains API documentation for the icedtea-web Java Web Start \
and plugin implementation."
LICENSE = "GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-javadoc-1.8.8-12.2.noarch.rpm"
RPM_HASH = "2b508bc347241959ec2d5722a75d05d377967fe81add7af6a470c822036ee1b9b47ca32d150833b341cd42f4a49677fc7853ff73d724a46c52109ed5f24992b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icedtea-web-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
