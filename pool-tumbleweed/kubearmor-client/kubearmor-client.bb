SUMMARY = "KubeArmor cli tool aka kArmor"
DESCRIPTION = "karmor is a client tool to help manage KubeArmor, which is a Cloud-native \
Runtime Security Enforcement System. Workload hardening and implementing \
least-permissive policies made easy."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "kubearmor-client-1.4.9-1.2.aarch64.rpm"
RPM_HASH = "68860396c067ada5b215b79f0d8775fdb2b3ca8c1eeb6f382a882b42f058749d8caf2349a32cea96fe78da11ccfccc9a9a74c453232ff25cf419fefd5d3d4c6f"

RPROVIDES:${PN} += "kubearmor-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
