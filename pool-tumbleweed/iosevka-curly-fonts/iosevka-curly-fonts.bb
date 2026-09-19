SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-curly-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "3e2fc60c89adb10e7585c0341801ba45c35e5c09971d3e00d9752254bff5b5aed25008d46e171f1e96c522e7229ea35805924d64249de04b5337bff0a09c5e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
