SUMMARY = "A SPICE Circuit Optimizer"
DESCRIPTION = "ASCO brings circuit optimization capabilities to existing SPICE \
simulators using a parallel differential evolution (DE) optimization \
algorithm. Currently, out-of-the-box support for Eldo, HSPICE, LTspice, \
Spectre, Qucs and ngspice exist."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-0.4.11-3.9.aarch64.rpm"
RPM_HASH = "ce97c693ce5fc63492396ef6a889437dce50f447cc891ed6197188a4cbe49104c365bd0db8c02eb84047e595b9eeba947b2c841ea4e5a0144f4c0f6eb6a7131f"

RPROVIDES:${PN} += "asco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
