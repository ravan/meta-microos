SUMMARY = "A Django front end for Mathics3"
DESCRIPTION = "python313-Mathics-Django provides a Django front end for Mathics3, integrating GUI and help \
browser."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "10.0.0"

RPM_NAME = "python313-Mathics-Django-10.0.0-1.2.noarch.rpm"
RPM_HASH = "c143990a1724139ffaab6f4ab0b202e6a6660c832d5d19fd01af827fc48155466f9b0437739617332571451d60403f33381e012dc0b78cec0227764229bee771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics-Django \
python3-Mathics3-Django \
python3.13dist-mathics3-django \
python313-Mathics-Django \
python313-Mathics3-Django \
python3dist-mathics3-django"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Mathics-Scanner \
python313-Mathics3 \
python313-django \
python313-matplotlib \
python313-networkx \
python313-pygments \
python313-requests \
update-alternatives"

inherit rpm
