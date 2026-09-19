SUMMARY = "Info Files for the XEmacs Packages"
DESCRIPTION = "This package contains all the info files for the extra packages for \
XEmacs. All these files can be read online with XEmacs and describe \
XEmacs and some of its modes. \
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

RPM_NAME = "xemacs-packages-info-20130822-17.7.noarch.rpm"
RPM_HASH = "c3e1ea1d139c02880e1dc71424c29353fc0c4a29fd3f765f685ff76ab4d0d69687bf253804f05f14259844e1b7b71bdcd3b7cced76c36c92f28f32bbeb3eb300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info-/usr/share/xemacs/xemacs-packages/info/auctex.info.gz \
xemacs-packages-info"

RDEPENDS:${PN} += ""

inherit rpm
