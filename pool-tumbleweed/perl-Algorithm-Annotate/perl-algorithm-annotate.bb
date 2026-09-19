SUMMARY = "Represent a series of changes in annotation list"
DESCRIPTION = "Algorithm::Annotate generates a list that is useful for generating output \
simliar to 'cvs annotate'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100.0"

RPM_NAME = "perl-Algorithm-Annotate-0.100.0-1.9.noarch.rpm"
RPM_HASH = "3991d12fad41e72250816e3610090296eabd0450cb935dbf1e569ec74096a6b2ae908c96a6acaa7d7a9d3123b59959312a0d33af0709f52796647d8ffc196b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Annotate \
perl-Algorithm-Annotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Algorithm--Diff"

inherit rpm
