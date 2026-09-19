SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python313-python-aiml-0.9.3-4.5.noarch.rpm"
RPM_HASH = "5b71fae1581ae2b9b4a90cf0a49ab59903abd80936bd0580f7cc2e3228c48385726404f69cd9ad4c2712bb40ea0bf88c940895095297e7bd933bc5f746fbdf0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiml \
python3-python-aiml \
python3.13dist-python-aiml \
python313-aiml \
python313-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
