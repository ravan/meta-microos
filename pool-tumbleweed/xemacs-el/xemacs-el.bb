SUMMARY = "Emacs-Lisp source files for XEmacs"
DESCRIPTION = "Most Emacs-Lisp source files are not needed for running XEmacs. Most of \
them are also available in byte compiled form and therefore not \
necessary at runtime. The true XEmacs addict will install them \
nevertheless because it is often useful and enlightening to have a look \
at the Lisp sources."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.36"

RPM_NAME = "xemacs-el-21.5.36-1.1.noarch.rpm"
RPM_HASH = "18545ca04af1f208bc3af23960c65cc5dc4b4bdc9a0ad3920a701944888cb8b5414d7a2ad4d393d8edeb75fe3acb0cb23ffa1eb7fb9d998bc70542c9378d166f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el"

RDEPENDS:${PN} += "xemacs \
xemacs-packages-el"

inherit rpm
