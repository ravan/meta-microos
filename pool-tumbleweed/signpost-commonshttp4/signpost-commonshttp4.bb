SUMMARY = "Signpost Apache HttpClient Supports"
DESCRIPTION = "Signpost Apache HttpClient Supports."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-commonshttp4-1.2.1.2-3.20.noarch.rpm"
RPM_HASH = "79f65c5ef52000942822053b0bc018d60e32554c3c12341bd1e5015a65ec1589c68dde4646f503c3325c452002837051d48f4e46d2a72beb36af5563fc85f833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-signpost-commonshttp4 \
mvn-oauth.signpost-signpost-commonshttp4-pom- \
signpost-commonshttp4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-oauth.signpost-signpost-core \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore"

inherit rpm
