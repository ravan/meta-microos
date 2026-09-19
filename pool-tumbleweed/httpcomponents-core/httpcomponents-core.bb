SUMMARY = "Set of low level Java HTTP transport components for HTTP services"
DESCRIPTION = "HttpCore is a set of low level HTTP transport components that can be \
used to build custom client and server side HTTP services with a \
minimal footprint. HttpCore supports two I/O models: blocking I/O \
model based on the classic Java I/O and non-blocking, event driven I/O \
model based on Java NIO. \
 \
The blocking I/O model may be more appropriate for data intensive, low \
latency scenarios, whereas the non-blocking model may be more \
appropriate for high latency scenarios where raw data throughput is \
less important than the ability to handle thousands of simultaneous \
HTTP connections in a resource efficient manner."
LICENSE = "Apache-2.0"

PV = "4.4.14"

RPM_NAME = "httpcomponents-core-4.4.14-1.7.noarch.rpm"
RPM_HASH = "ee1d6b3d44c3f47c869260af5f955eee286e8d161da7c963518ad59649d5109b30f01250f60cae59b0d06e92af7f71f76645ee91fc707d4c5c63d6dd6e64e8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-core \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.httpcomponents-httpcore-nio \
mvn-org.apache.httpcomponents-httpcore-nio-pom- \
mvn-org.apache.httpcomponents-httpcore-pom- \
osgi-org.apache.httpcomponents.httpcore \
osgi-org.apache.httpcomponents.httpcore-nio"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
