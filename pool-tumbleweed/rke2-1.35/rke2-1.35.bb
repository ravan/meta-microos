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

PV = "1.35.7+rke2r1"

RPM_NAME = "rke2-1.35-1.35.7+rke2r1-1.1.aarch64.rpm"
RPM_HASH = "824700d053f7fd5492b504ec527d8e2378031d77ff8c2133357d3c505d8d84fa7f0036503c88e1156b02b5af7b1a0d4c64e66863bf46267ceefdcf3db96c812a"

RPROVIDES:${PN} += "rke2 \
rke2-1.35"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
libc.so.6"

inherit rpm
