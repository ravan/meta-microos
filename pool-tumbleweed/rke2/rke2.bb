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

PV = "1.36.3+rke2r1"

RPM_NAME = "rke2-1.36.3+rke2r1-2.1.aarch64.rpm"
RPM_HASH = "80027fa3cf2a712714199da19bca0ed78e962252691d60e966afce07ea5550252b206178308e4f11719845151ff5f2f9a4fa4a2e234fb57e9a325f6992b64227"

RPROVIDES:${PN} += "rke2"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
libc.so.6"

inherit rpm
