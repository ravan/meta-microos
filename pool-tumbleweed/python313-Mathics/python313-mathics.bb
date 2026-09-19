SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a \
free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "10.0.0"

RPM_NAME = "python313-Mathics-10.0.0-1.2.noarch.rpm"
RPM_HASH = "d66b55f5393a9f29940e501e85b3c9553fb624388d52aaba04f8a12622c3e68c1ecd3418049fcb25d9480389a05fc98f1b0c5620d91c30ec2d0876ef7f924ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics \
python3-Mathics3 \
python3.13dist-mathics3 \
python313-Mathics \
python313-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Mathics-Scanner \
python313-Pint \
python313-Pympler \
python313-Timed-Threads \
python313-mpmath \
python313-numpy \
python313-palettable \
python313-python-dateutil \
python313-requests \
python313-scipy \
python313-stopit \
python313-sympy \
update-alternatives"

inherit rpm
