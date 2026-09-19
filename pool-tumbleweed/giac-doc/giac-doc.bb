SUMMARY = "Documentation for giac"
DESCRIPTION = "This document describes the basic structure and provides information on \
usage of giac, a computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "giac-doc-2.0.0-2.6.noarch.rpm"
RPM_HASH = "c8f8160055474ab010d9e216b45dfcfcf62ec6cbf6c3ad73feab4cbaeb3b8fbac7fffea1a18af6a55cf9de00f41cbfdcaf52effc8b8c87f71ca4ad072e401f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
