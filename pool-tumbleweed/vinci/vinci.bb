SUMMARY = "Polytope volume computation program"
DESCRIPTION = "Vinci implements several algorithms for computing the volume of a \
full dimensional bounded polyhedron (polytope). The polytope must be \
given by its vertex or hyperplane or double representation in the \
lrslib or cddlib formats."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "vinci-1.0.5-1.11.aarch64.rpm"
RPM_HASH = "56d28793e8154fbe42082f94178f2fc3eb4bbf1f3ff7293a9c645949cd6f35d48c084685b2e38611b1b88b91ccadcf07fd97cc326c61a1d30d5e50ff7d42ce1e"

RPROVIDES:${PN} += "vinci"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
