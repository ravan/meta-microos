SUMMARY = "CLI tools to collect and process netflow data"
DESCRIPTION = "The nfdump tools collect and process netflow data on the command line. \
They are part of the NFSEN project which is explained more detailed at \
http://www.terena.nl/tech/task-forces/tf-csirt/meeting12/nfsen-Haag.pdf"
LICENSE = "BSD-3-Clause"

PV = "1.7.10"

RPM_NAME = "nfdump-1.7.10-1.1.aarch64.rpm"
RPM_HASH = "487a92df8911ee64522d8e7299f15b5d703d2fd5d0eecf76e63c8e4ab5d0dea15b83cabdcd45a8a1b103daa990c36b0e91836ee14c79d5879ab4a0708c5ba929"

RPROVIDES:${PN} += "config-nfdump \
group-nfdump \
nfdump \
user-nfdump"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnfdump-1.7.10.so \
libnffile-1.7.10.so \
librrd.so.8 \
rrdtool"

inherit rpm
