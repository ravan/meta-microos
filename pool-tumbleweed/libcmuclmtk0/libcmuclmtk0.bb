SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the shared library used by the CMU-Cambridge \
Language Model Toolkit."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "libcmuclmtk0-0.7-12.10.aarch64.rpm"
RPM_HASH = "4d167cc933d255ba27c3199165cef1843dcdf5a5ee953d76a2bc3d81430720632838676069f3e7a2eeb7134e03bad84d8344285abf79404958ef3cd8c7344975"

RPROVIDES:${PN} += "libcmuclmtk.so.0 \
libcmuclmtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
