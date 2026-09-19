SUMMARY = "Helper files for making river easy to use"
DESCRIPTION = "This package contains files that make river easier to use such as \
listing it to a Display Manager such as GDM with a desktop file or \
setting up sane environmental variables before running river in \
`river.sh`. These files are not part of the river project."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-contrib-0.3.12-2.6.noarch.rpm"
RPM_HASH = "a21f540638efccc4c3994ca5e40321c95781a2249c43a9feb79893c9f377ffc5db89f17a5f44b7d13576d9ed468937fb2d4777a6e8f86e82e68db8d67698c755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-contrib"

RDEPENDS:${PN} += "/usr/bin/python3 \
river"

inherit rpm
