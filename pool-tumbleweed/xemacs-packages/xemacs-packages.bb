SUMMARY = "XEmacs Packages"
DESCRIPTION = "A collection of additional lisp packages for XEmacs. You must install \
this package when you want to use the XEmacs package, they are needed \
for most non-trivial XEmacs functions. \
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

RPM_NAME = "xemacs-packages-20130822-17.7.noarch.rpm"
RPM_HASH = "8ff821d373aa86531438a1b0ebf8247d42685df1e09e523d5d4ea9d6a0ee3fb0bb652c069e020951bfa5b57b8d1f706f45601fb9aad91e87b897e64deb9a55c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xemacs-packages \
xemacs-/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.elc \
xemacs-packages"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
