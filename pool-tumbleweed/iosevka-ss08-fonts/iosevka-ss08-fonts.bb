SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss08-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "056a882d34b24f048673d9918a7f6ac6bfcf0a57ee158fe9a693db919bc9c4d4b38491bdfbd9ac8dd5f2d0071cbf9c916aff1920c7a17731dfda0b2244a11d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
