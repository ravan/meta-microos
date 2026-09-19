SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "RasMol is an X Window System tool intended for the visualization of \
proteins and nucleic acids. It reads Brookhaven Protein Database (PDB) \
files and interactively renders them in a variety of formats on either \
an 8-bit or 24/32-bit color display. \
 \
Examples are in /usr/lib/rasmol."
LICENSE = "SUSE-Public-Domain"

PV = "2.7.4.2"

RPM_NAME = "rasmol-2.7.4.2-79.6.aarch64.rpm"
RPM_HASH = "19ae011ada13882b4655dd59a22027cdbad40007bff635b83f3aa80db42c0f9a2d0696a61b1dd9978fdb3f178faa7c1918bf6a0cfd7945adbde32acd53ecdf8e"

RPROVIDES:${PN} += "RasMol \
rasmol"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
