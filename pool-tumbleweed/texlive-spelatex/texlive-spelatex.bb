SUMMARY = "Create PDF documents with hyperlinks to audiofragments"
DESCRIPTION = "This package equips the PDF that is generated with LaTeX with \
hyperlinks to audio files that contain the spoken equivalent of \
the original text, equations, figures and tables. The audio \
files can be automatically generated using a Perl-script called \
spel-wizard.pl (part of the SpeL::Wizard module available on \
CPAN). This script interfaces with locally installed \
text-to-speech software or with online available (paying) cloud \
services to generate the audio files. To this end, the LaTeX \
chunks of your text are parsed and translated to 'natural \
language'. SpeLaTeX is babel-enabled such that your text is \
read with the correct pronunciation corresponding to your \
language. So far, it provides the languages English and Dutch, \
but it will be extended in the future. You can package your PDF \
together with the audio-files (in your favorite archive format) \
and make it available to your users, such that the only \
requirements to read your text and listen to the audio are a \
suited PDF reader and media player. For the text-to-speech \
conversion, one can use free options (festival, balabolka, ...) \
or paying services (e.g. AWS polly)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn76924"

RPM_NAME = "texlive-spelatex-2026.226.0.0.95svn76924-64.2.noarch.rpm"
RPM_HASH = "a5d82b5bab3f0976d8ba1c05392e7c2c178a94fd3f39127978bab26718a43ffbddea5b66302b1e31d408776b858db072e89b6ece91cca7dbcd0d344ecdde4e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spelatex.sty \
texlive-spelatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-newfile.sty \
tex-rotating.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
