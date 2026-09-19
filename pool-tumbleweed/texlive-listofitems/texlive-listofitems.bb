SUMMARY = "Grab items in lists using user-specified sep char"
DESCRIPTION = "This simple package is designed to read a list of items whose \
parsing character may be selected by the user. Once the list is \
read, its items are stored in a structure that behaves as a \
dimensioned array. As such, it becomes very easy to access an \
item in the list by its number. For example, if the list is \
stored in the macro \\foo, the item #3 is designated by \\foo[3]. \
A component may, in turn, be a list with a parsing delimiter \
different from the parent list, paving the way for nesting and \
employing a syntax reminiscent of an array of several \
dimensions of the type \\foo[3,2] to access the item #2 of the \
list contained within the item #3 of the top-tier list."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.65svn77682"

RPM_NAME = "texlive-listofitems-2026.226.1.65svn77682-61.2.noarch.rpm"
RPM_HASH = "19ea8dc95b9845d80f224f08c8504532a2a0f7129763239c7eb45f22ff23cca2c4c9c1902685febe5379403d69aae3d1df220bb59537a533992078adc27caabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listofitems.sty \
tex-listofitems.tex \
texlive-listofitems"

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
