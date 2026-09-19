SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-2.3.7-3.5.aarch64.rpm"
RPM_HASH = "72e88cfafcc5de588df4a034e49e81ab82c7c2969d83449bf0e15c2aba65ca4c35cd9363dcdb95ca86c1115a3f950d8f2762684f11e29e6be050b352d380ab00"

RPROVIDES:${PN} += "adms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadmsAdmstpath.so.0 \
libadmsElement.so.0 \
libadmsPreprocessor.so.0 \
libadmsVeriloga.so.0 \
libc.so.6"

inherit rpm
