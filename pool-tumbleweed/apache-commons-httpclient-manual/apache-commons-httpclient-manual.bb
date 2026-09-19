SUMMARY = "Manual for apache-commons-httpclient"
DESCRIPTION = "Manual for apache-commons-httpclient \
 \
Manual for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-manual-3.1-15.9.noarch.rpm"
RPM_HASH = "2e4f099708a0e8ccf08dff9c1d04e3a14c7b3dc9bc611031117313ec30370aa5b47cbbd862af91ba52b679fde196a58294e0a9806d703eae0f9b78e2ef44a1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-manual"

RDEPENDS:${PN} += ""

inherit rpm
