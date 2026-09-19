SUMMARY = "Compiler assisted localization library (CAL10N)"
DESCRIPTION = " \
 \
 \
 \
 \
 \
Compiler Assisted Localization, abbreviated as CAL10N (pronounced as 'calion') \
is a java library for writing localized (internationalized) messages. \
Features: \
    * java compiler verifies message keys used in source code \
    * tooling to detect errors in message keys \
    * native2ascii tool made superfluous, as you can directly encode bundles \
      in the most convenient charset, per locale. \
    * good performance (300 nanoseconds per key look-up) \
    * automatic reloading of resource bundles upon change"
LICENSE = "MIT"

PV = "0.8.1.12"

RPM_NAME = "cal10n-0.8.1.12-2.7.noarch.rpm"
RPM_HASH = "f78da1653e56e3a7b9f8398f9a38789d36399d60b30074c8b1f46a6499f730067782448fffd5206306eef5bcc9c01c96bee0453e1093bee88cd333df255be22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n \
mvn-ch.qos.cal10n-cal10n-ant-task \
mvn-ch.qos.cal10n-cal10n-ant-task-pom- \
mvn-ch.qos.cal10n-cal10n-api \
mvn-ch.qos.cal10n-cal10n-api-pom- \
osgi-cal10n.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
