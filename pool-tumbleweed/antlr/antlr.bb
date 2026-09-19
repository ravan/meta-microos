SUMMARY = "Another Tool for Language Recognition"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers)."
LICENSE = "GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-2.7.7-126.4.aarch64.rpm"
RPM_HASH = "5d6bc51da27da73b46f69c6d862cd98939a27766b327ea024f269d2d04ac983d3a97502fc0612ccb4149e4d2608addfcbb109ed64ca7531597671588dd33fe27"

RPROVIDES:${PN} += "antlr \
antlr-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
antlr-java"

inherit rpm
