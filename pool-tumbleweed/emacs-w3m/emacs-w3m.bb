SUMMARY = "An interface program to use w3m with Emacs"
DESCRIPTION = "Emacs-w3m is an interface program to use w3m with Emacs. \
 \
W3 is the most well known WEB browser which works on (X)Emacs, but it \
is very slow. Emacs-w3m is an alternative. It uses w3m, which is a pager \
with WWW capability, developed by Akinori ITO. It is a pager, but it \
can be used as a text-mode WWW browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.632+569+g5c965214"

RPM_NAME = "emacs-w3m-1.4.632+569+g5c965214-1.7.noarch.rpm"
RPM_HASH = "ee17eede1d7c6e0e96919982983ec1b188ba39bc9ab402bddd00d522564ee0a2d91cffe10dfd1c85ce618fb72c77aa9d4eaaeb88dbfedab287746a48d585d96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-emacs-w3m \
emacs-w3m \
w3m-el"

RDEPENDS:${PN} += "/usr/bin/sh \
apel \
emacs \
flim \
w3m"

inherit rpm
