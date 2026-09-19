SUMMARY = "Python Bugzilla Interface"
DESCRIPTION = "PyBugz is a python and command line interface to Bugzilla. \
 \
It was conceived as a tool to speed up the workflow for Gentoo Linux \
developers and contributors when dealing with bugs using Bugzilla. By \
avoiding the clunky web interface, the user quickly search, isolate and \
contribute to the project very quickly. Developers alike can easily extract \
attachments and close bugs all from the comfort of the command line."
LICENSE = "GPL-2.0-only"

PV = "0.14"

RPM_NAME = "python313-pybugz-0.14-1.5.noarch.rpm"
RPM_HASH = "753490de86cbb763a4cc87c9403e4490ccb057f51da00d59b08712d49d9e441ce0edbd13d51bdeed5279adf1cadcb182fd1ba1011d4cfa689f7099365b88f21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz \
python3-pybugz \
python3.13dist-pybugz \
python313-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
