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

RPM_NAME = "python314-flexx-0.8.4-3.5.noarch.rpm"
RPM_HASH = "fdea8f926c13803a497ac55e92ba4d77362e0a247f00064da5e7392f466d8d066059473d23189a3fc9b2e629c01239b1ed4d377e117938b5bda00ba2b60af661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flexx \
python314-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-dialite \
python314-pscript \
python314-tornado \
python314-webruntime"

inherit rpm
