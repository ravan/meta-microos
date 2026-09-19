SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python314-python-aiml-0.9.3-4.5.noarch.rpm"
RPM_HASH = "34ea275556b4ffd89a04ddfc561a6b96dd89011bbe967f31538d985e7a1e8b799e570629e64f4474e1ec196e6a306476bbe862fe5c2845b696b29f8bc5efd0a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-aiml \
python314-aiml \
python314-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
