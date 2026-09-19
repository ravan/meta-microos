SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "python314-nocasedict-2.2.0-1.4.noarch.rpm"
RPM_HASH = "bbf2056fc5e2f330cf23099b441350796039f493168ad7998aea4a42f83401336a4ff130086185f0342f5ed4ab9a7e44ca575acf199d96555c29d355f9334701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nocasedict \
python314-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
