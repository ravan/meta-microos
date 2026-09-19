SUMMARY = "StAX API extensions"
DESCRIPTION = "This project develops a few extensions to complement JSR-173 StAX API in the \
following area. \
 \
* Enable parser instance reuse (which is important in the \
  high-performance environment like JAXB and JAX-WS) \
* Improve the support for reading from non-text XML infoset, \
  such as FastInfoset. \
* Improve the namespace support."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-1.8-7.6.noarch.rpm"
RPM_HASH = "20c2207f29dc9af9f4cc22f075baf31240748d112b43786fa40f6b90ba577a3f9722cd2c272e73fa30e2f6463208f8100592d98e7d5f725a74a04a9cc28080e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet.staxex-stax-ex \
mvn-org.jvnet.staxex-stax-ex-pom- \
osgi-org.jvnet.staxex.stax-ex \
stax-ex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm
