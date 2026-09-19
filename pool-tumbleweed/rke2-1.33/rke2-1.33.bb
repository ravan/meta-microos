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

PV = "1.33.13+rke2r2"

RPM_NAME = "rke2-1.33-1.33.13+rke2r2-1.1.aarch64.rpm"
RPM_HASH = "f2515403641101a5c9c4e7972470eb64310885bb4b61dce6ff01d2950b41c0000cb8b0f6cfa9073856af24371ce291904b84bdfef00a707f16b4b2b5c52c2b19"

RPROVIDES:${PN} += "rke2 \
rke2-1.33"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
libc.so.6"

inherit rpm
