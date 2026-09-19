SUMMARY = "MathJax resources as a Jupyter Server Extension -- configuration"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension. \
This package contains the jupyter server extension configuration common \
to all python flavors."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "jupyter-server-mathjax-0.2.6-4.5.noarch.rpm"
RPM_HASH = "4e567e64225ac3aeb5b3f473503bb6149fc8a6c47593a64304bcbf9ecbc4699813648694bd7cb275d2aa6cdb3de839e035cfb58f3b8998124a1423c82fb1b9f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-mathjax"

RDEPENDS:${PN} += ""

inherit rpm
