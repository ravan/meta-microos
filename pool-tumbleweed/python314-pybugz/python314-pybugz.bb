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

RPM_NAME = "python314-pybugz-0.14-1.5.noarch.rpm"
RPM_HASH = "3b7fd171e0ac98a58a2bcaba92f34a5bb236dfc3c0f2ab3f35aabcb01d30f9a0cd2015f7b7a2e440e7bd117f1c673d64ea9183393602b2eebe994c830cd196cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybugz \
python314-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
