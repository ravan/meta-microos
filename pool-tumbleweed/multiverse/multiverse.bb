SUMMARY = "A software transactional memory implementation for the JVM"
DESCRIPTION = "A software transactional memory implementation for the JVM. Access (read and \
writes) to shared memory is done through transactional references, that can be \
compared to the AtomicReferences of Java. Access to these references will be \
done under A (atomicity), C (consistency), I (isolation) semantics."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-0.7.0-3.21.noarch.rpm"
RPM_HASH = "5ab07678c4e1216ef5622c1677356f660029bef1b102cdc276d0fab4eee06a6228d85184aa4b91b5be5fc58a1ba584f93ac5439b72a01a8a2814c3ee6e512ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse \
mvn-org.multiverse-multiverse-core \
mvn-org.multiverse-multiverse-core-pom- \
mvn-org.multiverse-multiverse-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
