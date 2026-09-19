SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss04-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "cf885c57bab1bb42930803101141155621d7c530116b50c7bad0c54eade1a8ef9cf96c16ee801b068461ff639b9e53cfb61842128f2b9d39837080046bb72746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
