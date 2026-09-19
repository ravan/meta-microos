SUMMARY = "Bulgarian Ispell Dictionary"
DESCRIPTION = "This packages includes a ready Bulgarian dictionary for ispell. \
A short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the packages ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0+ | MPL-1.1 | LGPL-3.0+"

PV = "4.2"

RPM_NAME = "ispell-bulgarian-4.2-2.7.noarch.rpm"
RPM_HASH = "33f80aeb3002d2e805456ca5ab8bcc4e4a6c3f3fb1f9ff48128274b600bb3a80ad866c03ff702d660e683d0030c9aa534b1b6e08b0f8ce60e341c4acfcc3550d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-bulgarian \
ispell-dictionary \
locale-ispell-bg"

RDEPENDS:${PN} += ""

inherit rpm
