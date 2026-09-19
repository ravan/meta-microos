SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the include files and libraries used to compile \
programs using the CMU-Cambridge Language Model Toolkit."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "libcmuclmtk-devel-0.7-12.10.aarch64.rpm"
RPM_HASH = "68e10d582c9f37bbb0c3ce6bc2388baee21f751097dea001dc5bdd749efb41ea2713f8afef49cd94fcb10191589a9e91b5375b4fe713ac094cd2e7e2bf57d219"

RPROVIDES:${PN} += "libcmuclmtk-devel"

RDEPENDS:${PN} += "cmuclmtk \
libcmuclmtk0"

inherit rpm
