SUMMARY = "GTK+ 2 support for the Dracula theme"
DESCRIPTION = "This package provides the GTK+ 2 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "gtk2-metatheme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "ed2a421201c39c5c61ed76b28efd98a484e46c8c64feeaeef41fb8e0cbde59910dab266288d248930f494e11e97fafe37ba0de0b7b852873be4916dfd08b8e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gtk2-metatheme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
