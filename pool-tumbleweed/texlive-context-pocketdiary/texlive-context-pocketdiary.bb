SUMMARY = "A personal organiser"
DESCRIPTION = "PocketDiary is a calendar module, enabling to prepare various \
calendars from day- to week, month- and year-calendars based on \
the ideas contained in PocketMods, having 8 pages arranged on a \
A4 single-sided printed sheet of paper. The module comes with \
different templates for notes etc. The module provides sun and \
moon data calculations"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn73164"

RPM_NAME = "texlive-context-pocketdiary-2026.226.svn73164-61.2.noarch.rpm"
RPM_HASH = "fab6a84ae8efd19a47c4efa705424493dc5ad9f400012cb9d2fe058130ce1538c748a5be2e671b726c3ddf983c21527b2c5ad4a20310b34e82cb0024823c1f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-pocketdiary"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
