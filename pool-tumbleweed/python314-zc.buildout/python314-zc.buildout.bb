SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "5.2.0"

RPM_NAME = "python314-zc.buildout-5.2.0-1.2.noarch.rpm"
RPM_HASH = "a035267cbabf5ebbacb8d68b579345699c526a5ddbaf2783ecac9ee957d19fc1a9e05772b2638cc7328fa506881481429c3e0251744c51948dc444c2dbb51220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zc.buildout \
python314-zc-buildout \
python314-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-pip \
python314-setuptools \
python314-wheel"

inherit rpm
