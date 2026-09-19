SUMMARY = "Tests and displays connectivity between nodes in a Kubernetes cluster"
DESCRIPTION = "Goldpinger makes calls between its instances to monitor your networking. It \
runs as a DaemonSet on Kubernetes and produces Prometheus metrics that can be \
scraped, visualised and alerted on. \
 \
Oh, and it gives you the graph below for your cluster."
LICENSE = "Apache-2.0"

PV = "3.11.2"

RPM_NAME = "goldpinger-3.11.2-1.4.aarch64.rpm"
RPM_HASH = "0caa300bb9fc7cef41393523e2cd802c9258089f33bcd2914760ca26e0859778c6c4e58031890fd748e989a9e37d860a76e9ff4420da4589a320842d0ad2bd58"

RPROVIDES:${PN} += "goldpinger"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
