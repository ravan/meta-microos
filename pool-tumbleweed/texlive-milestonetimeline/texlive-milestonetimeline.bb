SUMMARY = "Horizontal milestone timeline"
DESCRIPTION = "The milestonetimeline package provides a flexible way to create \
horizontal milestone timelines in LaTeX documents with support \
for date-based positioning, label rotation, and per-milestone \
customization. Features: Date-based positioning (ISO format: \
YYYY-MM-DD) Automatic spacing (when no dates provided) \
Customizable label rotation (0, 45, 90 degrees) Per-milestone \
height control Highlighted milestones (different color/shape) \
Compact and vertical presets Date markers on timeline"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn78165"

RPM_NAME = "texlive-milestonetimeline-2026.226.1.0svn78165-61.2.noarch.rpm"
RPM_HASH = "3753315bc6b21bd356c163d3d212781419ec4da72fd4055e3c1c6e8cb26871a9b866b670352d5a53b10c2f04d978f4bcacfaa35b11d0190a8833815ade182a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-milestonetimeline.sty \
texlive-milestonetimeline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
