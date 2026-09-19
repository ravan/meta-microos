SUMMARY = "High-speed, two-pass portable 6502 cross-assembler"
DESCRIPTION = "xa is a high-speed, two-pass portable cross-assembler for the 6502 CPU \
with a C-like preprocessor. One of several popular 65xx assemblers, xa \
is written in C and released under the GPL-2. It has been in continuous \
development since 1989. \
 \
Other tools in the xa package are: \
 * file65   - a tool for printing information about o65 object files. \
 * ldo65    - a linker for o65 object files. \
 * printcbm - a simple CBM BASIC detokenizer similar to the far more \
              powerful petcat proviced by VICE. \
 * reloc65  - a relocator for o65 object files. \
 * uncpk    - a c64 cpk archive manager."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xa-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "b050dbf06fff8d803e236ec5c308190b2ed4aa1f77e4559eb845903caaf19dcaf82f35c6b99b5c1fb8fc4f397a3ccf1eddf9cd21f808afabdb649893473d0ad5"

RPROVIDES:${PN} += "xa"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
