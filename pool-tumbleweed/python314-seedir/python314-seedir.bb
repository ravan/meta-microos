SUMMARY = "Package for creating, editing, and reading folder tree diagrams"
DESCRIPTION = "Package for creating, editing, and reading folder tree diagrams."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-seedir-0.5.1-1.2.noarch.rpm"
RPM_HASH = "6883a6d50e6845ba25fd46e71289adcfd035d89e514e6848fc029e1972b2c70e461e9a0f41a35d1e5a6491bfe062389092fe386315cf6abd71e2080d926061c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-seedir \
python314-seedir \
python3dist-seedir"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-natsort \
update-alternatives"

inherit rpm
