SUMMARY = "JDBC driver for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced Object-Relational database management \
system. The postgresql-jdbc package includes the .jar files needed for \
Java programs to access a PostgreSQL database."
LICENSE = "BSD-2-Clause"

PV = "42.7.11"

RPM_NAME = "postgresql-jdbc-42.7.11-1.2.noarch.rpm"
RPM_HASH = "f1ac86bee1ada8c97337f2adef99b695a7883081f00658df8dbfa1ea4f9402c76044c8bb8231c5f71f22233e57666ad597a0c1b2b3263e66ea9b52874b129fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.postgresql-postgresql \
mvn-org.postgresql-postgresql-pom- \
mvn-postgresql-postgresql \
mvn-postgresql-postgresql-pom- \
postgresql-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.scram-scram-client"

inherit rpm
