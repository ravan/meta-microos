SUMMARY = "Grace library"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. This devel \
package contains a library to work with grace from other applications. \
 \
For further information consult the main package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-devel-5.1.25-7.7.aarch64.rpm"
RPM_HASH = "4ce7d15069aa326b0d60f897f87dc23b9d0d8f1879b1008de357e492bda8be22b0a64ca72908c5167c76f77105954fb03e1880eb77215facf85eb8e6b10bfa88"

RPROVIDES:${PN} += "xmgrace-devel"

RDEPENDS:${PN} += ""

inherit rpm
