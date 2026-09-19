SUMMARY = "Documentation Module for GnuCash"
DESCRIPTION = "GnuCash is a personal finance manager. A check-book like register GUI \
allows you to enter and track bank accounts, stocks, income and even \
currency trades. The interface is designed to be simple and easy to \
use, but is backed with double-entry accounting principles to ensure \
balanced books. This is the documentation module for GnuCash."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "gnucash-docs-5.5-1.9.noarch.rpm"
RPM_HASH = "98eeca9714795f143e32bc6d8621e7b9250205d60c5fe9e1a11dbdb6f0f7b7f80d2b80a052b95fef270f0e2a670875a40202ffaf4695ecd0bd74e9b054f8ea97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-docs"

RDEPENDS:${PN} += ""

inherit rpm
