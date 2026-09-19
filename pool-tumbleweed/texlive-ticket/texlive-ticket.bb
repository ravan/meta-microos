SUMMARY = "Make labels, visiting-cards, pins with LaTeX"
DESCRIPTION = "Provides an easy to handle interface to produce visiting cards, \
labels for your files, stickers, pins and other stuff for your \
office, conferences etc. All you need is a definition of your \
'ticket' included in a ticket definition file and the two \
commands \\ticketdefault and \\ticket."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-2026.227.0.0.4dsvn42280-62.2.noarch.rpm"
RPM_HASH = "fb139ca7f6ecc398ee7160a95ad6c4afd62be2bd7393e74fcdb3b454b780f0710cd239104670d4603a20302f1636b09751d07b8dd68d852dda718806d5780135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ticket.sty \
texlive-ticket"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
