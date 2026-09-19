SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the front-end tools for easy language model \
training as well as the basic tools for manipulating N-Gram and text files."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "cmuclmtk-0.7-12.10.aarch64.rpm"
RPM_HASH = "80f55b760950806a9f92865ba8fcec24c030baa5224ea34af2fc853bc2c0278caefe4b66878a7b5f84facf1deb8411effae81628278699e8b6f21a8210a3dc71"

RPROVIDES:${PN} += "cmuclmtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmuclmtk.so.0 \
libm.so.6"

inherit rpm
