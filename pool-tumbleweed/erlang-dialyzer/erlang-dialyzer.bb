SUMMARY = "A DIscrepany AnaLYZer for ERlang programs"
DESCRIPTION = "A DIscrepany AnaLYZer for ERlang programs."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-dialyzer-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "a410d3ab00d5c671d1df6de651d948348fa1a14055fea416532d43e7f74bf14450e012805b40b05520eb27f8ac46d23756f8ea217b7ec6832cc1e9ae9ac45f6c"

RPROVIDES:${PN} += "erlang-dialyzer"

RDEPENDS:${PN} += "erlang \
erlang-wx \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
