SUMMARY = "A minimal LuaLaTeX package for rendering JSON Resume data into LaTeX documents"
DESCRIPTION = "A minimal LuaLaTeX package for rendering JSON Resume data into \
clean, professional resumes. Features Full JSON Resume Schema \
Support All 12 sections (basics, work, volunteer, education, \
awards, certificates, publications, skills, languages, \
interests, references, projects) Load from File or URL Local \
JSON files or remote URLs Schema Validation Strict mode warns \
about schema violations Clean FAANG-style Formatting \
Professional typography with no distracting design elements \
Customizable Section Titles Override default section headers \
Requirements LuaLaTeXPart of TeX Live or MiKTeX curl For URL \
loading, pre-installed on most systems"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77560"

RPM_NAME = "texlive-jsonresume-2026.226.1.0.2svn77560-63.2.noarch.rpm"
RPM_HASH = "7d35f3b4e541ea2c6b87f3fa7b3094f23ccb8e65222304f1f2047d05e28a7a71ac2dc9e1d7e60aecc10372d958e92016b20e79b9852cc295ebc47f71d5d6aba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jsonresume.sty \
texlive-jsonresume"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
