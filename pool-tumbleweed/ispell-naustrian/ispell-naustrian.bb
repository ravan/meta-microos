SUMMARY = "New Austrian ispell dictionary"
DESCRIPTION = "This package includes a ready Austrian dictionary for ispell according \
the new spelling rules.  The name of the dictionary is naustrian to be able \
to distinguish it from those of the German packages. A short usage \
description is given in /usr/share/doc/packages/ispell/README of the \
package ispell."
LICENSE = "GPL-2.0-or-later"

PV = "20161207"

RPM_NAME = "ispell-naustrian-20161207-6.1.aarch64.rpm"
RPM_HASH = "452e4ed12968ca7f9f96057649b0d7b47c6bdc90769150dc7384803aa909e74934f0b24827bb83bc939997c2e04c340b126aa32dfc0a60c880ac8eff9aedd145"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-naustrian \
locale-ispell-de-AT"

RDEPENDS:${PN} += ""

inherit rpm
