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

RPM_NAME = "python313-pyosf-1.0.5-6.5.noarch.rpm"
RPM_HASH = "ba8a1e0a1e7fbb7fae7c6aae4d12e6a1a0478439380268dc337a772bdcde0ba6ab97ca0716b700e3a0dc0b43806a6abf42077daf447bd10ea9f34e645a75dc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyosf \
python3.13dist-pyosf \
python313-pyosf \
python3dist-pyosf"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
