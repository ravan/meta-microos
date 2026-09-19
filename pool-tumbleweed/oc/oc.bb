SUMMARY = "Openshift / OKD Client CLI"
DESCRIPTION = "With OpenShift Client CLI (oc), you can create applications and manage \
OpenShift resources. It is built on top of kubectl which means it provides its \
full capabilities to connect with any kubernetes compliant cluster, and on top \
adds commands simplifying interaction with an OpenShift cluster."
LICENSE = "Apache-2.0"

PV = "4.22.0"

RPM_NAME = "oc-4.22.0-1.3.aarch64.rpm"
RPM_HASH = "3512e372decb41e4c71fac2f32da739b5d1615161f47c5ce6534a4b1700c0d9428a263361806e53b3ab20c3f84d9d0745c78a663936437f3acec2d671ca69d7c"

RPROVIDES:${PN} += "oc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
