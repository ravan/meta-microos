SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the manual for antlr."
LICENSE = "GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-manual-2.7.7-126.4.noarch.rpm"
RPM_HASH = "f663df8e689470fa2b9901e47d45ee113c39f2ec5bc3f1b5adcf056db1f655ddaa38a30ede91bae20abc0e39f93b20fb8e314d6c2f09fb666ded068f86d510fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-manual"

RDEPENDS:${PN} += ""

inherit rpm
