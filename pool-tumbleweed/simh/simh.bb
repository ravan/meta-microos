SUMMARY = "A collection of simulators of historically significant data processing systems"
DESCRIPTION = "This package contains simulators of the following systems: \
Data General Nova \
Data General Eclipse \
Digital Equipment Corporation PDP-1 \
Digital Equipment Corporation PDP-4 \
Digital Equipment Corporation PDP-7 \
Digital Equipment Corporation PDP-8 \
Digital Equipment Corporation PDP-9 \
Digital Equipment Corporation PDP-10 \
Digital Equipment Corporation PDP-11 \
Digital Equipment Corporation PDP-15 \
Digital Equipment Corporation PDP-18B \
IBM 1401 \
IBM System 3 \
Hewlett-Packard HP 2100 \
Honeywell H316 \
MITS Altair 8800 \
 \
A disk image with UNIX V7 for the PDP-11 is included, instructions on \
how to make it work can be found in the file \
/usr/share/doc/packages/simh/simh_swre.txt in chapter 2.1.3. \
 \
A selection of software for other systems can be found at The Computer \
History Simulation Project at http://simh.trailing-edge.com/"
LICENSE = "BSD-3-Clause"

PV = "3.12_5"

RPM_NAME = "simh-3.12_5-1.9.aarch64.rpm"
RPM_HASH = "f2c4ec3d2c931a7817a1be52407b0bbc86098a32b6e09af8e5250d272dd1aaf30268a786a86d6a802ca49ac580c19b18b24baf2961691839b389bf25df61948a"

RPROVIDES:${PN} += "simh"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
