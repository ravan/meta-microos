SUMMARY = "A TikZ library for creating BPMN models"
DESCRIPTION = "This package provides primitives for drawing Business Process \
Modelling and Notation (BPMN) models. It includes tasks, \
subprocesses, events, task markers and gateways. The symbols \
aim to follow the BPMN standard as closely as possible. Please \
refer to the documentation for further information."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn73368"

RPM_NAME = "texlive-tikz-bpmn-2026.227.svn73368-62.2.noarch.rpm"
RPM_HASH = "d8fec6402d32084bda6a190423bd0a7ac87a2311d37acb3ce925cf23a0ef61ab3e0e1256b1aae50f988e29a0febb68c8ccd20dba8b897dc445a5935532262d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarybpmn.code.tex \
texlive-tikz-bpmn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
