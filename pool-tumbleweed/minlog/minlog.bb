SUMMARY = "Minimal overhead Java logging"
DESCRIPTION = "MinLog is a Java logging library. Key features: \
 \
* Zero overhead Logging statements below a given level \
  can be automatically removed by javac at compile time. \
  This means applications can have detailed trace and \
  debug logging without having any impact on the finished product. \
 \
* Simple and efficient The API is concise and the code \
  is very efficient at run-time. \
 \
* Extremely lightweight The entire project consists of a single \
  Java file with ~100 non-comment lines of code."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-1.3.1-2.11.noarch.rpm"
RPM_HASH = "0647e732ba91f6ac659e2d31e3c27fdde6cbbed0c3d60f717d9b5ca92ff4a143c4dacd1d37c63cf036409dc46671aa03c1e96029889c69673d4143bd214af098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog \
mvn-com.esotericsoftware-minlog \
mvn-com.esotericsoftware-minlog-pom- \
mvn-com.esotericsoftware.minlog-minlog \
mvn-com.esotericsoftware.minlog-minlog-pom- \
mvn-com.googlecode-minlog \
mvn-com.googlecode-minlog-pom- \
osgi-com.esotericsoftware.minlog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
