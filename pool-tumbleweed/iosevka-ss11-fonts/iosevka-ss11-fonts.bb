SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss11-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "779307b7ab3ac1872bbc7401b1d97181fd38d85b82383dc842060a39ed42b733f064bb704fdcb56af7057fed93544d811e22804d19ded0d0fe927f91cf0f20d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
