SUMMARY = "Support programs for Airspy HF+ SDR"
DESCRIPTION = "Host software for Airspy HF+, a software defined radio \
for the HF and VHF bands."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-1.6.8-4.7.aarch64.rpm"
RPM_HASH = "174dc5a918c1192826eac677f3553eb9ecdb374f90a73028a562271fd1ac54d1c47f5e8a4aa2ebd2cc6805f13acd01abdc1f0fd34bcba7defe8bdc341df0f127"

RPROVIDES:${PN} += "airspyhf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libairspyhf.so.0 \
libc.so.6"

inherit rpm
