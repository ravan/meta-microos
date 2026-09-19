SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_5815ee3"

RPM_NAME = "gasket-driver-1.0.18_5815ee3-6.16.aarch64.rpm"
RPM_HASH = "48378f2684592535c86cec79bcf6b0b284d04e7fa2fe84a876c717f8799e0135e9c2f3dcf84d91ebb64d3267ac00f924e2536a4fce9f2366ba791991c9205859"

RPROVIDES:${PN} += "gasket-driver \
group-apex"

RDEPENDS:${PN} += "/usr/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
