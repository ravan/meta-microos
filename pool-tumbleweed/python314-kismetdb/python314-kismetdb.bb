SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python314-kismetdb-2019.05.05-4.5.noarch.rpm"
RPM_HASH = "da052aab834d9c595e1739c560ca9ea79cd4e080f6868433302efad77595355f444b550265cd34095a113df57a3e0359c10822b0ccf9b69d5195b16e8759babb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kismetdb \
python314-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-dateutil \
python314-simplekml"

inherit rpm
