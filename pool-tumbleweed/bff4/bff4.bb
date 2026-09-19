SUMMARY = "Fast Brainfuck interpreter"
DESCRIPTION = "Optimizing brainfuck implementation of dialect based on Daniel's dbfi (see 'A very short self-interpreter') \
 \
This interpreter has only one input: program and input to the program have to be separated with ! e.g. ',.!a' prints 'a' To use it in interactive mode paste your program as input. \
 \
This program is compiled with optimization of linear loops (where '<>' balanced), e.g. [->+>++<<]. Linear loop is then executed in one step. \
 \
Oleg Mazonka 4.12.06  http://mazonka.com/"
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "bff4-1-15.9.aarch64.rpm"
RPM_HASH = "f0ebec3b892837f9288af61f45dd31ff83504aa19375d061107d20d44c8ce99e6afa85006e841b187ac4fb2f3c6d89b786228143db0de44e869d21cea57ff74d"

RPROVIDES:${PN} += "bff4"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
