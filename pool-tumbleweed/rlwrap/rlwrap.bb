SUMMARY = "A Readline Wrapper"
DESCRIPTION = "rlwrap uses the GNU readline library to allow the editing of keyboard \
input for any other command. The input history is remembered across \
invocations, separately for each command;history completion and search \
work as in bash and completion word lists can be specified on the \
command line."
LICENSE = "GPL-2.0-or-later"

PV = "0.48"

RPM_NAME = "rlwrap-0.48-1.4.aarch64.rpm"
RPM_HASH = "04dc622682db7292903b8ee6685428b4b6567d960527e37c38f9d13f3457d6afb270a753ddcc3a30eef2756f6c280c19ff28fea1bfd6f61546d9ed807439dce1"

RPROVIDES:${PN} += "perl-RlwrapFilter \
rlwrap"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
