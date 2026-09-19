SUMMARY = "Conformance test suite for diagnosing a Kubernetes cluster"
DESCRIPTION = "Sonobuoy is a diagnostic tool that makes it easier to understand the state of a \
Kubernetes cluster by running a set of plugins (including Kubernetes \
conformance tests) in an accessible and non-destructive manner. It is a \
customizable, extendable, and cluster-agnostic way to generate clear, \
informative reports about your cluster. \
 \
Its selective data dumps of Kubernetes resource objects and cluster nodes allow \
for the following use cases: \
 \
* Integrated end-to-end (e2e) conformance-testing \
* Workload debugging \
* Custom data collection via extensible plugins"
LICENSE = "Apache-2.0"

PV = "0.57.5"

RPM_NAME = "sonobuoy-0.57.5-1.3.aarch64.rpm"
RPM_HASH = "81bb1f06733303958efa1c581bb79001bcd8692a54968c1a83eaac72cdce4036bcf8174bd815632bbd15164eb6cd46c336263a65f2698b93044df292cfb2de92"

RPROVIDES:${PN} += "sonobuoy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
