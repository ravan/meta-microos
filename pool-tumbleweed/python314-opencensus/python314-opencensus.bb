SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.4"

RPM_NAME = "python314-opencensus-0.11.4-2.7.noarch.rpm"
RPM_HASH = "e43f7c00c63363472012712ec2f143e1293715e08cebf4183af1bb5f94a99bd2a26ef98892c52ac22a69190d575b18c33702763595db0ba1cdcb7eddb725ec3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opencensus \
python314-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-opencensus-context \
python314-six"

inherit rpm
