SUMMARY = "Demonstration files for apache-commons-httpclient"
DESCRIPTION = "Demonstration files for apache-commons-httpclient. NOTE: It is \
possible that some demonstration files are specially prepared for SUN \
Java runtime environment. If they fail with IBM or BEA Java, the \
package itself does not need to be broken. \
 \
Demonstration files for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-demo-3.1-15.9.noarch.rpm"
RPM_HASH = "30b853198ce213983644a132b146c69908e0521c93205d3b81bd6a08d69b9d2d8c73b651b78479a5c432a42f841497d30fe9a9ad7b2a91acae75dbeb0dcb4853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-demo"

RDEPENDS:${PN} += "apache-commons-httpclient"

inherit rpm
