SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE2, also known as RKE Government, is Rancher's next-generation Kubernetes \
distribution. \
It is a fully conformant Kubernetes distribution that focuses on security and \
compliance within the U.S. Federal Government sector. \
 \
To meet these goals, RKE2 does the following: \
* Provides defaults and configuration options that allow clusters to pass the \
  CIS Kubernetes Benchmark with minimal operator intervention \
* Enables FIPS 140-2 compliance \
* Supports SELinux policy and Multi-Category Security (MCS) label enforcement \
* Regularly scans components for CVEs using trivy in our build pipeline"
LICENSE = "Apache-2.0"

PV = "1.34.10+rke2r1"

RPM_NAME = "rke2-1.34-1.34.10+rke2r1-1.1.aarch64.rpm"
RPM_HASH = "228d567f665fa67c00308398e04a7c113fdfa6e39c191b132b98981b4f120ac709954601caea999c03eda6c9cbf56c8b9cd441f3679c098d8e035eb8f857621b"

RPROVIDES:${PN} += "rke2 \
rke2-1.34"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
libc.so.6"

inherit rpm
