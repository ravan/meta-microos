SUMMARY = "Detecting and warning about obsolete LaTeX commands"
DESCRIPTION = "Old habits die hard. All the same, there are commands, classes \
and packages which are outdated and superseded. The nag package \
provides routines to warn the user about the use of such \
obsolete things. As an example, we provide an extension that \
detects many of the 'sins' described in l2tabu."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-nag-2026.226.0.0.7svn77682-61.2.noarch.rpm"
RPM_HASH = "a8c5a756f2d527cad757330ffc538b09ed4937844edbdde24ff8a5d8d8b657d05bfcb28d0a0067864fba459daf4a2a72bd4d4f84cddca0e3c8fd688c5d2f89b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nag-abort.cfg \
tex-nag-experimental.cfg \
tex-nag-l2tabu.cfg \
tex-nag-orthodox.cfg \
tex-nag.sty \
texlive-nag"

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
