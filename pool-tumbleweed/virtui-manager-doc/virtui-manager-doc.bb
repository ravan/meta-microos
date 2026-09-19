SUMMARY = "Documentation for virtui-manager"
DESCRIPTION = "This package contains the HTML documentation for virtui-manager."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "virtui-manager-doc-3.2.1-1.1.noarch.rpm"
RPM_HASH = "81dd2f60faecb6d42f446e4c79c5f644911b76c29f039d5b9cdc5904e496859a048f17fa0025d661cc3229339ba09b775fb706caa879c31100d2a284d2becfd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virtui-manager-doc"

RDEPENDS:${PN} += ""

inherit rpm
