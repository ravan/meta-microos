SUMMARY = "Several Lisp Files for GNU Emacs"
DESCRIPTION = "Several Lisp files not needed for running GNU Emacs. Most of these \
files are pre-byte compiled and therefore not necessary."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-el-31.1-3.1.noarch.rpm"
RPM_HASH = "77001730b88716f7c54e1a5952048460ae453fb21f7f8cf99d2570890335e458c5915a931e840e4d937c9cf9e9c7c0f9b06aab180f31131985301a2c70d5f236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-devel \
emacs-el \
rpm-macro--emacs-archsitelispdir \
rpm-macro--emacs-etcdir \
rpm-macro--emacs-sitelispdir \
rpm-macro--emacs-sitestartdir \
rpm-macro-emacs-addto-load-path"

RDEPENDS:${PN} += "emacs"

inherit rpm
