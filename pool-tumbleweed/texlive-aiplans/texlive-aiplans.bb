SUMMARY = "A TikZ-based library for drawing POCL plans"
DESCRIPTION = "This TikZ library is designed for generating diagrams related \
to Automated Planning, a subdiscipline of Artificial \
Intelligence. It allows users to define a 'domain model' for \
actions, similar to PDDL and HDDL used in hierarchical \
planning. The package is useful for researchers and students to \
create diagrams that represent sequential action sequences or \
partially ordered plans, including causal links and ordering \
constraints (e.g., POCL plans). It is particularly suited for \
presentations and scientific publications."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn74462"

RPM_NAME = "texlive-aiplans-2026.226.3.0svn74462-61.2.noarch.rpm"
RPM_HASH = "864769417718f797d82cd75afc1d51c7b050f4598b0760881e7a4d741793b62af570829b89f203d2ba0cbe897fe7bb1517d02d52887ec839e5dca6d236a1c45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryaiplans.code.tex \
texlive-aiplans"

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
