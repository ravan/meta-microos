SUMMARY = "Python lib for synching with OpenScienceFramework projects"
DESCRIPTION = "The pyosf package is a pure Python library for file sync with \
Open Science Framework. \
 \
This package is for synchronisation of files from the local \
file space to the Open Science Framework (OSF). There is a more \
complex sync package by the Center for Open Science, \
who created OSF, called osf-sync. \
 \
The OSF official package is designed for continuous automated \
synchronisation of many projects (à la Dropbox). The authors of pyosf \
needed something simpler (for combination with PsychoPy). The pyosf \
package performs basic search/login/sync operations with single \
projects on OSF, but only when instructed to do so (no continuous \
sync)."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python314-pyosf-1.0.5-6.5.noarch.rpm"
RPM_HASH = "f932ca399c99790ad822c9ab1c719a20bd4009364b6cd54c12d639fc90441a47a941d4ef2999043b7580924c2361dd5dd3a97f2fa8cd63bee1277e436acd84bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyosf \
python314-pyosf \
python3dist-pyosf"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
