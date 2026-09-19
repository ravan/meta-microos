SUMMARY = "GAP: Standard finite fields and cyclic generators"
DESCRIPTION = "StandardFF provides a reproducible construction of the algebraic closure K of \
each finite prime field GF(p). It also implements the construction of \
standardized generators of any given order of subgroups of the multiplicative \
group of K. \
 \
The package contains some utility functions: embeddings of GAP's fields GF(q) \
which are defined via Conway polynomials, rewriting of Brauer character values, \
discrete logarithms in finite fields, irreducibility test and minimal \
polynomials over finite fields."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "gap-standardff-1.0-1.7.noarch.rpm"
RPM_HASH = "7cbaf63bc74c4ee1dd6da9bd9913fca6726ab03e81a49274137e365f210c47afc23574ce28bfa8d23fc842bad5f6c86074d4bfc8418ca505b928d2eb8eeaf7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-standardff"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc"

inherit rpm
