SUMMARY = "Common files for pybugz"
DESCRIPTION = "PyBugz is a python and command line interface to Bugzilla. \
 \
It was conceived as a tool to speed up the workflow for Gentoo Linux \
developers and contributors when dealing with bugs using Bugzilla. By \
avoiding the clunky web interface, the user quickly search, isolate and \
contribute to the project very quickly. Developers alike can easily extract \
attachments and close bugs all from the comfort of the command line. \
 \
This package contains common files for pybugz."
LICENSE = "GPL-2.0-only"

PV = "0.14"

RPM_NAME = "pybugz-common-0.14-1.5.noarch.rpm"
RPM_HASH = "ae55ee9332e47b423af5399194ee5c01c43b6e4966b21ce747b515979c6231058a8a51bf8e808e154d26ccb8c6c46896724f7bcb39b62946b39a88d58cc1a88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz-common"

RDEPENDS:${PN} += ""

inherit rpm
