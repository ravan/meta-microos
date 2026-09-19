SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python314-bugzillatools-0.5.5-9.5.noarch.rpm"
RPM_HASH = "285507fdd3338ee9ddf308f13982d4c600f97d2e373085f06390df618b5733921a7de0406b3e0c0f43c846f248ece6bf0898a8b8bfd537756dbe8723bf9f62e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bugzillatools \
python314-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
