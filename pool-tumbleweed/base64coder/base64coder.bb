SUMMARY = "Base64 encoder/decoder Java library"
DESCRIPTION = "Base64Coder is a Base64 encoder/decoder class. \
 \
There is no Base64 encoder/decoder in the standard Java SDK class \
library.  The undocumented classes sun.misc.BASE64Encoder and \
sun.misc.BASE64Decoder should not be used."
LICENSE = "Apache-2.0 | EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-20101219-3.10.noarch.rpm"
RPM_HASH = "081156e3b9da00254d3087a156c1a4e859dc3574b13da18f19040851a0a9bb70c619a3a5b623e91026638bf2db4b612c0d920fcee244032af1bca92f3af53ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder \
mvn-biz.source-code-base64coder \
mvn-biz.source-code-base64coder-pom- \
osgi-biz.source-code.base64coder"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
