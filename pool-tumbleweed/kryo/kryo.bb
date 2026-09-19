SUMMARY = "Object graph serialization framework for Java"
DESCRIPTION = "Kryo is a fast and efficient object graph serialization framework for Java. \
The goals of the project are speed, efficiency, and an easy to use API. \
The project is useful any time objects need to be persisted, whether to a \
file, database, or over the network. \
 \
Kryo can also perform automatic deep and shallow copying/cloning. \
This is direct copying from object to object, not object->bytes->object."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-4.0.2-4.7.noarch.rpm"
RPM_HASH = "e6c304c02ba8aa185527cec751ff08ae17576c9281d7bc3e60be97310b6e0d2cf230f5a3c76b0d274662b848df21484f789d923a6aafaed2995a03f93cd5dc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo \
mvn-com.esotericsoftware-kryo \
mvn-com.esotericsoftware-kryo-pom- \
mvn-com.esotericsoftware.kryo-kryo \
mvn-com.esotericsoftware.kryo-kryo-pom- \
osgi-com.esotericsoftware.kryo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.esotericsoftware-minlog \
mvn-com.esotericsoftware-reflectasm \
mvn-org.objenesis-objenesis"

inherit rpm
