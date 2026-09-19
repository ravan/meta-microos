SUMMARY = "Better alternative to kubectl port-forward"
DESCRIPTION = "krelay is a drop-in replacement for kubectl port-forward with some enhanced features. \
 \
Highlights \
 \
* Supports UDP port forwarding \
* Supports simultaneous forwarding of data to multiple targets. \
* Forwarding data to the given IP or hostname that is accessible within the \
  kubernetes cluster \
  * You could forward a local port to a port in the Service or a workload like \
    Deployment or StatefulSet, and the forwarding session will not be interfered \
    even if you perform rolling updates. \
  * The hostname is resolved inside the cluster, so you don't need to change \
    your local nameserver or modify the /etc/hosts."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "krelay-0.2.0-1.4.aarch64.rpm"
RPM_HASH = "b1302296c418711612c5e06f686422d7889cb92eee72e08fa0b599652fc06115725d978fc69a71d378341e560b8f72894ad692f2877fbdc5ac16354d052f8ff9"

RPROVIDES:${PN} += "krelay \
kubectl-relay"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
