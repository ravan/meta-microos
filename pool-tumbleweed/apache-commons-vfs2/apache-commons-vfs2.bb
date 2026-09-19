SUMMARY = "Commons Virtual File System"
DESCRIPTION = "Commons VFS provides a single API for accessing various \
different file systems. It presents a uniform view of the \
files from various different sources, such as the files on \
local disk, on an HTTP server, or inside a Zip archive. \
Some of the features of Commons VFS are: \
* A single consistent API for accessing files of different \
 types. \
* Support for numerous file system types. \
* Caching of file information. Caches information in-JVM, \
 and optionally can cache remote file information on the \
 local file system. \
* Event delivery. \
* Support for logical file systems made up of files from \
 various different file systems. \
* Utilities for integrating Commons VFS into applications, \
 such as a VFS-aware ClassLoader and URLStreamHandlerFactory. \
* A set of VFS-enabled Ant tasks."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "apache-commons-vfs2-2.10.0-1.6.noarch.rpm"
RPM_HASH = "7a4d3b5ee2d9f2e0f1d38bb8ef0024a4f6cd3b32d428185979f9874dec84ee28fa368f2e33b04a5473155ed6b5c9a98f518eb61ca24797e079f02fc3f0fd77f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2 \
mvn-org.apache.commons-commons-vfs2 \
mvn-org.apache.commons-commons-vfs2-pom- \
osgi-org.apache.commons.commons-vfs2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging \
mvn-org.apache.commons-commons-lang3"

inherit rpm
