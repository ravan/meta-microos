SUMMARY = "Tools to dis-assemble and re-assemble DVI files"
DESCRIPTION = "DTL (DVI Text Language) is a means of expressing the content of \
a DVI file, which is readily readable by humans. The DTL bundle \
contains an assembler dt2dv (which produces DVI files from DTL \
files) and a disassembler dv2dt (which produces DTL files from \
DVI files). The DTL bundle was developed so as to avoid some \
infelicities of dvitype (among other pressing reasons)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.6.1svn62387"

RPM_NAME = "texlive-dtl-2026.226.0.0.6.1svn62387-59.2.noarch.rpm"
RPM_HASH = "369554b04b230c3ea5d399b9760c3005987df7f49088ecf6b6e0fd242faeaaa1767f90b8cf05f20b0109d132a665e42df643d659812d73bf8bfa94b7cffbd81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dt2dv.1 \
man-dv2dt.1 \
texlive-dtl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dtl-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
