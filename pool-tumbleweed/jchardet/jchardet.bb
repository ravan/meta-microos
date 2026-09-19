SUMMARY = "Java port of Mozilla's automatic character set detection algorithm"
DESCRIPTION = "jchardet is a java port of the source from Mozilla's automatic charset \
detection algorithm. The original author is Frank Tang. What is available \
here is the java port of that code. The original source in C++ can be found \
from http://lxr.mozilla.org/mozilla/source/intl/chardet/. More information can \
be found at http://www.mozilla.org/projects/intl/chardet.html."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-1.1-3.8.noarch.rpm"
RPM_HASH = "49658d218d78556ffcef671da6f80547c6958f6cc16d3fa6df73f5831fcb2b8168304ecefd6fbe2dc495d26dc2e9c3099f51ddb68d5d2c9bffc419440d04e6cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet \
mvn-net.sourceforge.jchardet-jchardet \
mvn-net.sourceforge.jchardet-jchardet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
