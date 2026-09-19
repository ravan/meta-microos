SUMMARY = "HyperSQL Database Engine"
DESCRIPTION = "HSQLdb is a relational database engine written in JavaTM , with a JDBC \
driver, supporting a subset of ANSI-92 SQL. It offers a small (about \
100k), fast database engine which offers both in memory and disk based \
tables. Embedded and server modes are available. Additionally, it \
includes tools such as a minimal web server, in-memory query and \
management tools (can be run as applets or servlets, too) and a number \
of demonstration examples. \
 \
Downloaded code should be regarded as being of production quality. The \
product is currently being used as a database and persistence engine in \
many Open Source Software projects and even in commercial projects and \
products! In it's current version it is extremely stable and reliable. \
It is best known for its small size, ability to execute completely in \
memory and its speed. Yet it is a completely functional relational \
database management system that is completely free under the Modified \
BSD License. Yes, that's right, completely free of cost or \
restrictions!"
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "hsqldb-2.7.4-1.7.noarch.rpm"
RPM_HASH = "0e43745b1513781ed92e4b7ac8fc8615585f21e4bda77477057267f7eb8e7a4917afd4de72fc43b65d6b467ff4dc39af7667199457803317ab25de7a2f463752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hsqldb \
group-hsqldb \
hsqldb \
mvn-org.hsqldb-hsqldb \
mvn-org.hsqldb-hsqldb-pom- \
user-hsqldb"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
java-headless \
javapackages-filesystem \
servletapi5 \
systemd"

inherit rpm
