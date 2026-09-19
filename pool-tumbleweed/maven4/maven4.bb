SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "4.0.0~rc6"

RPM_NAME = "maven4-4.0.0~rc6-2.1.aarch64.rpm"
RPM_HASH = "97f0e8ac0180ead89a467825c01241fd6d2529b4f23cb15c3b6de85a5082acf1861a2dbdf24450805a663101ce66a001ed031d888614990db6e08e6dc2be9594"

RPROVIDES:${PN} += "maven4"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
maven4-lib"

inherit rpm
