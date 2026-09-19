SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.10.0~rc1"

RPM_NAME = "maven-3.10.0~rc1-1.1.aarch64.rpm"
RPM_HASH = "0b083e69dab00a1d0ebd9a64a7f6663dc293079de0d39ca7eb988758d0e47eae01d4027952fc2938896d957b8ac6b374937a7b9df3cfbee5a4044ceddc2e4ccb"

RPROVIDES:${PN} += "maven"

RDEPENDS:${PN} += "aaa-base \
maven-lib"

inherit rpm
