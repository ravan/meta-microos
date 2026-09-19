SUMMARY = "Message Sequence Chart Renderer"
DESCRIPTION = "Mscgen is a small program that parses Message Sequence Chart descriptions and \
produces PNG, EPS, SVG or server side image maps (ismaps) as the \
output. Message Sequence Charts (MSCs) are a way of representing entities and \
interactions over some time period and are often used in combination with SDL. \
MSCs are popular in Telecoms to specify how protocols operate although MSCs \
need not be complicated to create or use. Mscgen aims to provide a simple text \
language that is clear to create, edit and understand, which can also be \
transformed into images."
LICENSE = "GPL-2.0"

PV = "0.20"

RPM_NAME = "mscgen-0.20-3.33.aarch64.rpm"
RPM_HASH = "ee8d272ede4f59876a6ec4fd020f244522e9522370e6ec5b21fb3fa13887b13b15d498069911722125bf27e63080b300e1987c7e7af91b09673c59017246e5b6"

RPROVIDES:${PN} += "mscgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6"

inherit rpm
