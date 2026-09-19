SUMMARY = "Additional Unix Utilities"
DESCRIPTION = "This is a growing collection of the Unix tools that nobody thought to write long ago, when Unix was young. \
 \
So far, it includes the following utilities: \
 \
  - chronic: runs a command quietly unless it fails \
  - combine: combine the lines in two files using boolean operations \
  - errno: look up errno names and descriptions \
  - ifdata: get network interface info without parsing ifconfig output \
  - ifne: run a program if the standard input is not empty \
  - isutf8: check if a file or standard input is utf-8 \
  - lckdo: execute a program with a lock held \
  - mispipe: pipe two commands, returning the exit status of the first \
  - parallel: run multiple jobs at once \
  - pee: tee standard input to pipes \
  - sponge: soak up standard input and write to a file \
  - ts: timestamp standard input \
  - vidir: edit a directory in your text editor \
  - vipe: insert a text editor into a pipe \
  - zrun: automatically uncompress arguments to command \
 \
The `moreutils` package includes errno, ifdata, ifne, isutf8, lckdo, mispipe, pee and sponge. \
The remaining programs are included in the `moreutils-parallel`, `moreutils-perl`, `chronic` and `ts` packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & (GPL-2.0-or-later | MIT) & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.70"

RPM_NAME = "moreutils-0.70-1.9.aarch64.rpm"
RPM_HASH = "48673f5f5ae33e1e87afef2dddf2d3ee2ce472298be8e3ecd8aeda67613f468951d23b8fa5669824204efee04451cc3068292d234aeab9d7f2ce5a8b5ae967b5"

RPROVIDES:${PN} += "moreutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
