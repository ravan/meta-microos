SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. It reads Brookhaven Protein Database (PDB) files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "garlic-1.6-223.11.aarch64.rpm"
RPM_HASH = "36b44ad48e85a970a09a1e6e4d24e8b249855fb72d945112cbf950d2e4501ea704d56d282507795a2aeab3ee80e3127425d600f6586eccf97b09cebbfadd508d"

RPROVIDES:${PN} += "config-garlic \
garlic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
