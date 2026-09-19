SUMMARY = "Shared code used by several utilities written by Jody Bruchon"
DESCRIPTION = "libjodycode is a software code library containing code shared among several of the programs written by Jody Bruchon such as imagepile, jdupes, winregfs, and zeromerge. These shared pieces of code were copied between each program as they were updated. As the number of programs increased and keeping these pieces of code synced became more annoying, the decision was made to combine all of them into a single reusable shared library."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "libjodycode4-4.1.2-1.4.aarch64.rpm"
RPM_HASH = "d1e3b9e67995bc764b4f3a6da016734ec48cf724736375535fab4ef1e4c72ede79c37abc288fd6b0553c9d637b9e91d77385fc0988ce9d378aa11e8f81cd36a9"

RPROVIDES:${PN} += "libjodycode.so.4 \
libjodycode4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
