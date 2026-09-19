SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a \
free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "10.0.0"

RPM_NAME = "python314-Mathics-10.0.0-1.2.noarch.rpm"
RPM_HASH = "960587ce8e3002c79925bdbaea024479900671bce87d5fb92ca6333aeb2ae0e16220a2f5aa1f36f02feb0f486493e15f723a15c22536d1dec535f5e07ba14b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mathics3 \
python314-Mathics \
python314-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Mathics-Scanner \
python314-Pint \
python314-Pympler \
python314-Timed-Threads \
python314-mpmath \
python314-numpy \
python314-palettable \
python314-python-dateutil \
python314-requests \
python314-scipy \
python314-stopit \
python314-sympy \
update-alternatives"

inherit rpm
