SUMMARY = "HTML documentation and examples for groff"
DESCRIPTION = "The groff package provides compatible versions of troff, nroff, eqn, \
tbl, and other Unix text formatting utilities. \
 \
Groff is used to 'compile' man pages stored in groff or nroff format \
for different output devices, for example, displaying to a screen or in \
PostScript format for printing on a PostScript printer."
LICENSE = "GPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "groff-doc-1.23.0-6.5.noarch.rpm"
RPM_HASH = "91a0bf3c3062f4f0081ed8a2d236ed24f3441b14de93dae9f304deba8c5f97c79805156047323f9ccfcb6d3e6ec89a491e7628bd17e282d8fd7c4f24116df366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groff-doc"

RDEPENDS:${PN} += ""

inherit rpm
