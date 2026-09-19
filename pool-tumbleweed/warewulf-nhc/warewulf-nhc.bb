SUMMARY = "Warewulf Node Health Check (NHC)"
DESCRIPTION = "Warewulf Node Health Check (NHC) is a periodic 'node health check' script to be \
executed on each compute node to verify that the node is working properly. Nodes \
which are determined to be 'unhealthy' can be marked as down or offline so as to \
prevent jobs from being scheduled or run on them. This helps increase the \
reliability and throughput of a cluster by reducing preventable job failures due \
to misconfiguration, hardware failures, etc."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "warewulf-nhc-1.4.3-1.10.noarch.rpm"
RPM_HASH = "49b70870fdd81a6a1d34cf0d8eb2345b609097da5ae88dd557150b608b4620231619517e8fe43e553f301cd60dce48f8fa23b48d8b08612e5307c88c06550a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-warewulf-nhc \
warewulf-nhc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
logrotate"

inherit rpm
