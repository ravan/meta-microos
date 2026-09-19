SUMMARY = "The Reckless rAcket SHell"
DESCRIPTION = "Rash is a shell language, library, and REPL(Read–Eval–Print-Loop) for Racket. \
 \
Use as a REPL that is as convenient for pipelining programs as Bash is, but \
has all the power of Racket. Use as a scripting language with #lang rash. \
Embed in normal Racket files with (require rash), and mix freely with any \
other Racket language or library. \
 \
Rash is in active development, but it is largely stable (and the parts that \
are not are marked as such). It can be used as an interactive shell.  It \
currently lacks the interactive polish of Zsh or Fish, but it is so much \
better as a language."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "rash-0.2-3.23.aarch64.rpm"
RPM_HASH = "7f0f7589d0d82248c20d429b8b7ce33234a81b1395b3fce2945a1843f4a2d01e71dcd7263130e06c209894ce6313ad55fa630ca0957074fc33b19fd01471e086"

RPROVIDES:${PN} += "rash"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libedit0 \
libsqlite3-0 \
racket"

inherit rpm
