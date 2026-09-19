SUMMARY = "Brazilian ispell dictionary"
DESCRIPTION = "This package includes a ready Brazilian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-brazilian-1.5-426.1.aarch64.rpm"
RPM_HASH = "2ecff74a298e4f17283a4f259def08802321eca7ee07f7ed7eed3205c054ff8bb51348227e474eeb9fb9f12cf2569b801da2dd24da6b35ff4dc30208df729930"

RPROVIDES:${PN} += "ispell-brazilian \
ispell-dictionary \
locale-ispell-pt-BR"

RDEPENDS:${PN} += "/usr/bin/awk"

inherit rpm
