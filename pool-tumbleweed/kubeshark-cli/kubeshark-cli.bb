SUMMARY = "CLI for the API traffic analyzer for Kubernetes"
DESCRIPTION = "Kubeshark is an API Traffic Analyzer for Kubernetes providing real-time, \
protocol-level visibility into Kubernetes’ internal network, capturing and \
monitoring all traffic and payloads going in, out and across containers, pods, \
nodes and clusters. \
 \
This package contains the kubeshark CLI."
LICENSE = "Apache-2.0"

PV = "53.4.0"

RPM_NAME = "kubeshark-cli-53.4.0-1.1.aarch64.rpm"
RPM_HASH = "9f561418cd0c5b75428dc90a4ebad20d446d805a47d2e98053a764ce4d3652fcf910699961b569bd802a8a9fc63ba7f6a687c589d3600aa5b815571fef14c58e"

RPROVIDES:${PN} += "kubeshark-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
