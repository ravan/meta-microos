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

RPM_NAME = "python311-flexx-0.8.4-3.1.noarch.rpm"
RPM_HASH = "4ac68f184235957bf6de03a04c91f6023b9b81d649390155338708c9d5bff43b3c75817d5308a13f011ad8f28595158c664d09990fd3a0dfc6ea1f0198cd9b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flexx \
python311-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-dialite \
python311-pscript \
python311-tornado \
python311-webruntime"

inherit rpm
