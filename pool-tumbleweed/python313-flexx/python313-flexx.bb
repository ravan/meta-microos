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

RPM_NAME = "python313-flexx-0.8.4-3.5.noarch.rpm"
RPM_HASH = "0b0eb797b74fe054ceb21dd1a9221fca054357b304a219133684cf195a145396704ce27a6ca1ef1fff72f6c85b92022d618807911cca51824535247a53328c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexx \
python3.13dist-flexx \
python313-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-dialite \
python313-pscript \
python313-tornado \
python313-webruntime"

inherit rpm
