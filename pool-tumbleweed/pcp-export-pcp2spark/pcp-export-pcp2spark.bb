SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Apache Spark"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format to Apache Spark. See https://spark.apache.org/ for \
further details on Apache Spark."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2spark-6.3.8-3.1.noarch.rpm"
RPM_HASH = "d8985a6ec6c20d8d7d73f460df54720aa0f48f59e49026e5a064f9bb9cd07469e340d5129ea10ca46a4d7ef6fec176d4ec268a8163cf1cb9a4020511c8ed7a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2spark"

RDEPENDS:${PN} += "/usr/bin/pmpython \
libpcp3 \
python3-pcp"

inherit rpm
