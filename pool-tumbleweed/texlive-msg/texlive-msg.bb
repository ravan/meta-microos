SUMMARY = "A package for LaTeX localisation"
DESCRIPTION = "The package is designed to localise any document class or \
package. This should be very useful for end-users who could \
obtain messages in their own preferred language. It is really \
easy to use by writers of other classes and packages. \
Volunteers are urged to test the package, report, and even to \
localise the message file to their own language. Documentation \
is provided in English."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.51svn49578"

RPM_NAME = "texlive-msg-2026.226.0.0.51svn49578-61.2.noarch.rpm"
RPM_HASH = "78bbecec3ae366b0bd96e18ff4dd554a3af29ced13a060bd73d2d28c7a7b606b9f4b37f947f5d8a0efac64d173ec8224299639532eefe6d481a7264af34eeee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-french-msg-msg.tex \
tex-german-msg-msg.tex \
tex-msg-msg.tex \
tex-msg.sty \
tex-norsk-msg-msg.tex \
texlive-msg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
