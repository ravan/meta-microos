SUMMARY = "GAP: Symbolic Computation Software Composability Protocol in GAP"
DESCRIPTION = "The GAP package SCSCP implements the Symbolic Computation Software \
Composability Protocol for the computational algebra system GAP in \
accordance with: \
 \
* SCSCP specification: http://www.symbolic-computation.org/scscp \
 \
* OpenMath content dictionary scscp1: \
  http://www.win.tue.nl/SCIEnce/cds/scscp1.html \
 \
* OpenMath content dictionary scscp2: \
  http://www.win.tue.nl/SCIEnce/cds/scscp2.html"
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "gap-scscp-2.5.0-1.1.noarch.rpm"
RPM_HASH = "bbe23995fe54caca991bbe3004701a32b1e9a358a7dbc13c1222210431874ee58d33df0c5c878f8f1473842fe19bd034b1d12d493975bbe7a4e9f7c18e033351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-scscp"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-io \
gap-openmath"

inherit rpm
