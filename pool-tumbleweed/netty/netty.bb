SUMMARY = "An asynchronous event-driven network application framework and tools for Java"
DESCRIPTION = "Netty is a NIO client server framework which enables quick and easy \
development of network applications such as protocol servers and \
clients. It greatly simplifies and streamlines network programming \
such as TCP and UDP socket server. \
 \
'Quick and easy' doesn't mean that a resulting application will suffer \
from a maintainability or a performance issue. Netty has been designed \
carefully with the experiences earned from the implementation of a lot \
of protocols such as FTP, SMTP, HTTP, and various binary and \
text-based legacy protocols. As a result, Netty has succeeded to find \
a way to achieve ease of development, performance, stability, and \
flexibility without a compromise."
LICENSE = "Apache-2.0"

PV = "4.1.136"

RPM_NAME = "netty-4.1.136-1.1.aarch64.rpm"
RPM_HASH = "e808d920dbd03b5bd6d1e49739053d9e40f845e53e10eaee103969a0b4fef49e3e2a70abe91c1e027d6286b752041c1376a115520b308809bc43fff18027d444"

RPROVIDES:${PN} += "mvn-io.netty-netty-all \
mvn-io.netty-netty-all-pom- \
mvn-io.netty-netty-buffer \
mvn-io.netty-netty-buffer-pom- \
mvn-io.netty-netty-codec \
mvn-io.netty-netty-codec-dns \
mvn-io.netty-netty-codec-dns-pom- \
mvn-io.netty-netty-codec-haproxy \
mvn-io.netty-netty-codec-haproxy-pom- \
mvn-io.netty-netty-codec-http \
mvn-io.netty-netty-codec-http-pom- \
mvn-io.netty-netty-codec-http2 \
mvn-io.netty-netty-codec-http2-pom- \
mvn-io.netty-netty-codec-memcache \
mvn-io.netty-netty-codec-memcache-pom- \
mvn-io.netty-netty-codec-mqtt \
mvn-io.netty-netty-codec-mqtt-pom- \
mvn-io.netty-netty-codec-pom- \
mvn-io.netty-netty-codec-redis \
mvn-io.netty-netty-codec-redis-pom- \
mvn-io.netty-netty-codec-smtp \
mvn-io.netty-netty-codec-smtp-pom- \
mvn-io.netty-netty-codec-socks \
mvn-io.netty-netty-codec-socks-pom- \
mvn-io.netty-netty-codec-stomp \
mvn-io.netty-netty-codec-stomp-pom- \
mvn-io.netty-netty-codec-xml \
mvn-io.netty-netty-codec-xml-pom- \
mvn-io.netty-netty-common \
mvn-io.netty-netty-common-pom- \
mvn-io.netty-netty-dev-tools \
mvn-io.netty-netty-dev-tools-pom- \
mvn-io.netty-netty-handler \
mvn-io.netty-netty-handler-pom- \
mvn-io.netty-netty-handler-proxy \
mvn-io.netty-netty-handler-proxy-pom- \
mvn-io.netty-netty-handler-ssl-ocsp \
mvn-io.netty-netty-handler-ssl-ocsp-pom- \
mvn-io.netty-netty-resolver \
mvn-io.netty-netty-resolver-dns \
mvn-io.netty-netty-resolver-dns-classes-macos \
mvn-io.netty-netty-resolver-dns-classes-macos-pom- \
mvn-io.netty-netty-resolver-dns-pom- \
mvn-io.netty-netty-resolver-pom- \
mvn-io.netty-netty-transport \
mvn-io.netty-netty-transport-classes-epoll \
mvn-io.netty-netty-transport-classes-epoll-pom- \
mvn-io.netty-netty-transport-classes-kqueue \
mvn-io.netty-netty-transport-classes-kqueue-pom- \
mvn-io.netty-netty-transport-native-epoll \
mvn-io.netty-netty-transport-native-epoll--linux-aarch-64- \
mvn-io.netty-netty-transport-native-epoll-pom- \
mvn-io.netty-netty-transport-native-kqueue \
mvn-io.netty-netty-transport-native-kqueue-pom- \
mvn-io.netty-netty-transport-native-unix-common \
mvn-io.netty-netty-transport-native-unix-common--linux-aarch-64- \
mvn-io.netty-netty-transport-native-unix-common-pom- \
mvn-io.netty-netty-transport-pom- \
mvn-io.netty-netty-transport-sctp \
mvn-io.netty-netty-transport-sctp-pom- \
netty \
osgi-io.netty.all \
osgi-io.netty.buffer \
osgi-io.netty.codec \
osgi-io.netty.codec-dns \
osgi-io.netty.codec-haproxy \
osgi-io.netty.codec-http \
osgi-io.netty.codec-http2 \
osgi-io.netty.codec-memcache \
osgi-io.netty.codec-mqtt \
osgi-io.netty.codec-redis \
osgi-io.netty.codec-smtp \
osgi-io.netty.codec-socks \
osgi-io.netty.codec-stomp \
osgi-io.netty.codec-xml \
osgi-io.netty.common \
osgi-io.netty.dev-tools \
osgi-io.netty.handler \
osgi-io.netty.handler-proxy \
osgi-io.netty.handler-ssl-ocsp \
osgi-io.netty.resolver \
osgi-io.netty.resolver-dns \
osgi-io.netty.resolver-dns-classes-macos \
osgi-io.netty.transport \
osgi-io.netty.transport-classes-epoll \
osgi-io.netty.transport-classes-kqueue \
osgi-io.netty.transport-native-epoll \
osgi-io.netty.transport-native-epoll.linux-aarch-64 \
osgi-io.netty.transport-native-kqueue \
osgi-io.netty.transport-native-unix-common \
osgi-io.netty.transport-sctp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml-aalto-xml \
mvn-org.jctools-jctools-core"

inherit rpm
