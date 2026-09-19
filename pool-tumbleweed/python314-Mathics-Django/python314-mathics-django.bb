SUMMARY = "A Django front end for Mathics3"
DESCRIPTION = "python314-Mathics-Django provides a Django front end for Mathics3, integrating GUI and help \
browser."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "10.0.0"

RPM_NAME = "python314-Mathics-Django-10.0.0-1.2.noarch.rpm"
RPM_HASH = "a64fb5cf826cecfe2b3a65d30c38d09a763044a41bc19a568c63b3216b43cd1057b6fa81bfd9a96ce431c6c8bc34f601e4d1a476057588a12bedabddfa349cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mathics3-django \
python314-Mathics-Django \
python314-Mathics3-Django \
python3dist-mathics3-django"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Mathics-Scanner \
python314-Mathics3 \
python314-django \
python314-matplotlib \
python314-networkx \
python314-pygments \
python314-requests \
update-alternatives"

inherit rpm
