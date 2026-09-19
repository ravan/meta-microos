SUMMARY = "Exam class, focused on collaborative authoring"
DESCRIPTION = "The class design offers: Direct support for collaborative \
development of an exam, using a model in which a departmental \
'exams convener' or 'exam chair' coordinates multiple authors \
writing individual questions (the class file and associated \
process is in regular use within a physics and astronomy \
department). All of the 'traditional' exam paper features such \
as sectioning, per-part running marks, 'Question n continued' \
catchwords, and so on. Readily configured local adaptation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-2026.226.1.4.0svn64674-59.2.noarch.rpm"
RPM_HASH = "b417969843ceae8cce7d506e08ef76db22df23d22f0d97641f24a8b86eaaa105c6aa88b5650a9a713f465cf3e4a2bc0d51c3ed46eb7bbebb0451bebc1c4255c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-n.cls \
texlive-exam-n"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-helvet.sty \
tex-mathptm.sty \
tex-siunitx.sty \
tex-stix2.sty \
tex-textcomp.sty \
tex-times.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
