SUMMARY = "Python toolkit for creating graphical user interfaces"
DESCRIPTION = "Flexx is a pure Python toolkit for creating graphical user interfaces \
(GUIs), that uses web technology for its rendering. Apps are written \
purely in Python; Flexx's transpiler generates the necessary JavaScript \
on the fly. \
 \
Flexx can be used to create (cross platform) desktop applications, web \
applications, and (if designed well) export an app to a standalone HTML \
document. It also works in the Jupyter notebook."
LICENSE = "BSD-2-Clause"

PV = "0.8.4"

RPM_NAME = "python312-flexx-0.8.4-3.1.noarch.rpm"
RPM_HASH = "aed66db045e0bbb33c81a9ac267afac63024995c36fcfff96c27858a4feb8544a22810f08749fc04e16fdbb5a0c3abca52339325d8c13609f8a6bf0a42ed2864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-flexx \
python312-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-dialite \
python312-pscript \
python312-tornado \
python312-webruntime"

inherit rpm
