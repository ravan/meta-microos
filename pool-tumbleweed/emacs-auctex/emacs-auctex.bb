SUMMARY = "AUC TeX: An Emacs Extension"
DESCRIPTION = "These macros make it easier for you to write TeX documents with GNU \
Emacs.	Documentation can be found under: \
 \
/usr/share/doc/packages/emacs-auctex/ \
 \
and in the dvi files math-ref.dvi and tex-ref.dvi (reference cards) and \
in the info file auctex in emacs info-mode."
LICENSE = "GPL-3.0-or-later"

PV = "14.1.0"

RPM_NAME = "emacs-auctex-14.1.0-3.2.noarch.rpm"
RPM_HASH = "d38d4176c622e936e6fdd5fd6fe0f12f27b240d040c4fac6791ff86ff3a2a22373d5001b82d9ae6c197d6de58c6cb781428498bfc6c7f480e3170fe81993bfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auc-tex \
auctex \
emacs-auctex \
ge-auc"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-ELPA \
texlive-latex \
texlive-tools"

inherit rpm
