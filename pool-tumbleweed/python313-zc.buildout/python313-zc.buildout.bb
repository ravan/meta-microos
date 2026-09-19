SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "5.2.0"

RPM_NAME = "python313-zc.buildout-5.2.0-1.2.noarch.rpm"
RPM_HASH = "cdf69d137809ed3e8d37fc16a56bff96f1e4f0168bf442e1fb12eb338809bc5132052c62e571063e812d1176c77a6d7f3e6dd63c56483121045bded11cdcc460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-buildout \
python3-zc.buildout \
python3.13dist-zc.buildout \
python313-zc-buildout \
python313-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-pip \
python313-setuptools \
python313-wheel"

inherit rpm
