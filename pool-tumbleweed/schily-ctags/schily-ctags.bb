SUMMARY = "A program to generate tag files for ex/vi"
DESCRIPTION = "Ctags makes a tags file for ex(1) from the specified C, Pascal, \
Fortran, YACC, lex, and lisp sources. A tags file gives the locations \
of specified objects in a group of files. Each line of the tags file \
contains the object name, the file in which it is defined, and a \
search pattern for the object definition, separated by whitespace. \
Using the tags file, ex(1) can quickly locate these object \
definitions."
LICENSE = "BSD-2-Clause & CDDL-1.0 & GPL-2.0-only & GPL-2.0-or-later & BSD-3-Clause & HPND & ISC"

PV = "2024.03.21"

RPM_NAME = "schily-ctags-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "564645fb563ac74130935351c0edfbcd9d998459268585c8b5a22b0bcfe5edf73da34b6c3d38150469bfea9bb29d2e507bda1c8ee23f204102a75ccb93da80ea"

RPROVIDES:${PN} += "schily-ctags"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
