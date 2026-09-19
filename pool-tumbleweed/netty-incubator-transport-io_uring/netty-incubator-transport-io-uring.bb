SUMMARY = "Netty/Incubator/Transport/Parent/io_uring"
DESCRIPTION = "Netty is an asynchronous event-driven network application framework for \
rapid development of maintainable high performance protocol servers and \
clients. \
The new io_uring interface added to the Linux Kernel 5.1 is a high I/O \
performance scalable interface for fully asynchronous Linux syscalls."
LICENSE = "Apache-2.0"

PV = "0.0.26"

RPM_NAME = "netty-incubator-transport-io_uring-0.0.26-1.4.aarch64.rpm"
RPM_HASH = "542f0801ab8e72213196b0922dc03ef18caf38223feaac5d495ede1c9f1f01c93427561d7be03ca610fedf2ff713713d3ff73608264dc164dad045135288bcbd"

RPROVIDES:${PN} += "mvn-io.netty.incubator-netty-incubator-transport-classes-io-uring \
mvn-io.netty.incubator-netty-incubator-transport-classes-io-uring-pom- \
mvn-io.netty.incubator-netty-incubator-transport-native-io-uring \
mvn-io.netty.incubator-netty-incubator-transport-native-io-uring--linux-aarch-64- \
mvn-io.netty.incubator-netty-incubator-transport-native-io-uring-pom- \
mvn-io.netty.incubator-netty-incubator-transport-parent-io-uring-pom- \
netty-incubator-transport-io-uring \
osgi-io.netty.incubator.netty-incubator-transport-classes-io-uring \
osgi-io.netty.incubator.netty-incubator-transport-native-io-uring"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.netty-netty-buffer \
mvn-io.netty-netty-common \
mvn-io.netty-netty-transport \
mvn-io.netty-netty-transport-native-unix-common"

inherit rpm
