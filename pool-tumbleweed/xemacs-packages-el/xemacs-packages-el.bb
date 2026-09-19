SUMMARY = "Emacs-Lisp source files for the XEmacs packages"
DESCRIPTION = "Most Emacs-Lisp source files are not needed for running XEmacs. Most of \
them are also available in byte compiled form and therefore not \
necessary at runtime. The true XEmacs addict will install them \
nevertheless because it is often useful and enlightening to have a look \
at the Lisp sources. \
 \
 \
 \
Authors: \
-------- \
    Chuck Thompson   <cthomp@cs.uiuc.edu> \
    Ben Wing <wing@666.com> \
    and many other contributors"
LICENSE = "GPL-3.0-or-later"

PV = "20130822"

RPM_NAME = "xemacs-packages-el-20130822-17.7.noarch.rpm"
RPM_HASH = "2da7ac3605c9a7b01ccf16248ba584e1a43e8e5e8741d141fc039454d04f7db1551d165e51f520b61544497bf48fd75984499d6fcccbf78dee3555fb8ece39ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el-/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.el \
xemacs-packages-el"

RDEPENDS:${PN} += ""

inherit rpm
