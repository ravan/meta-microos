SUMMARY = "A bundle of outline font manipulation tools"
DESCRIPTION = "This bundle of tools comprises: Cfftot1, which translates a \
Compact Font Format (CFF) font, or a PostScript-flavored \
OpenType font, into PostScript Type 1 format. It correctly \
handles subroutines and hints; Mmafm and mmpfb, which create \
instances of multiple-master fonts (mmafm and mmpfb were \
previously distributed in their own package, mminstance); \
Otfinfo, which reports information about OpenType fonts, such \
as the features they support and the contents of their 'size' \
optical size features; Otftotfm, which creates TeX font metrics \
and encodings that correspond to a PostScript-flavored OpenType \
font. It will interpret glyph positionings, substitutions, and \
ligatures as far as it is able. You can say which OpenType \
features should be activated; T1dotlessj, creates a Type 1 font \
whose only character is a dotless j matching the input font's \
design; T1lint, which checks a Type 1 font for correctness; \
T1reencode, which replaces a font's internal encoding with one \
you specify; and T1testpage, which creates a PostScript proof \
for a Type 1 font. It is preliminary software."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn70015"

RPM_NAME = "texlive-lcdftypetools-2026.226.svn70015-61.2.noarch.rpm"
RPM_HASH = "7c5148b136e455a06d253162976f2a73b1567861d1601f899c7502ebcc271a248e940910d743c6c5470c7ee423e1e614c5878733053e716c6c0f0eb96b744763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-cfftot1.1 \
man-mmafm.1 \
man-mmpfb.1 \
man-otfinfo.1 \
man-otftotfm.1 \
man-t1dotlessj.1 \
man-t1lint.1 \
man-t1rawafm.1 \
man-t1reencode.1 \
man-t1testpage.1 \
man-ttftotype42.1 \
texlive-lcdftypetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-glyphlist \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lcdftypetools-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
