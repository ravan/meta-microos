SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python313-bugzillatools-0.5.5-9.5.noarch.rpm"
RPM_HASH = "480e92c5af1b746ba41f805f3227553b918ade2b8328394ca8704cab97f325d9695a3fa30f6f74b99153c406af155fadacf70e3713fafd4842936741a214bdb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzillatools \
python3.13dist-bugzillatools \
python313-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
