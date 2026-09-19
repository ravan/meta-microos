SUMMARY = "ANother Tool for Language Recognition (c++ runtime)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the C++ runtime (libantlr.a) and a headers files \
of antlr"
LICENSE = "GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-devel-2.7.7-126.4.aarch64.rpm"
RPM_HASH = "eecc69a96d90ddf5e615c4c4ec3346a2660838ebdf03f1103fbb45277c81324053dfa6db5ecadeb8b92fd3fd7bde9e9a7e8c3939d7d6686a62edc2a59ef53616"

RPROVIDES:${PN} += "antlr-devel"

RDEPENDS:${PN} += "antlr"

inherit rpm
