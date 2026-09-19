SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - scrlttr2.tex: a letter, written with \
scrlttr2.cls from the KOMA-Script bundle; - dinbrief.tex: a \
letter according to the German (DIN) standards, written with \
dinbrief.cls; - kbrief.tex: a brief memo ('Kurzbrief') to \
accompany enclosures, as used in German offices, again based on \
dinbrief; - vermerk.tex: a general form for taking down notes \
on events in the office; and - diabetes.tex: a diary for the \
basis-bolus insulin therapy of diabetes mellitus, using \
scrartcl.cls from the KOMA-Script bundle."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-templates-fenn-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "85d574597ba398c8d124d7beb1f1ea2b87bb9c80018d83d14b1a653fc1fef56a5c115471a6d575e59283a251f0fd36df7cebfe722caedbf461d0df9b13f551e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-fenn"

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
