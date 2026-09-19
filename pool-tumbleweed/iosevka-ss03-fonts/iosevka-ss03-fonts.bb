SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss03-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "d820b56b8792dbac316b8f7aa9f24a592d554aec5c71085af7855fb7e8f9a6621872730e3f3a181b8caf65fbf68cf8971ec3fdd501a0e54383c847bcd8b34116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
