SUMMARY = "A DIscrepany AnaLYZer for ERlang programs"
DESCRIPTION = "A DIscrepany AnaLYZer for ERlang programs."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-dialyzer-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "d72d484416ef61e65b62168a87cb2680f5ffa2574668c040119ae6d94bfb4507e21204e73848d355a18fb61db61e031fb3b90c44dc3ebbb92d319e20ad96c90f"

RPROVIDES:${PN} += "erlang-dialyzer \
erlang27-dialyzer"

RDEPENDS:${PN} += "erlang27 \
erlang27-wx \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
